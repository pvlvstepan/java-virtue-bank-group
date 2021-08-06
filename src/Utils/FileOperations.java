package Utils;

import static Pages.EditAccount.accountNumber;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class FileOperations {

    public static void LoadDataTable(String FilePath, String SearchTerm, JTable table, int[] ColumnsToDelete) {
        File f = new File(FilePath);

        try {
            BufferedReader br = new BufferedReader(new FileReader(f));
            // get first line as table headers
            String header = br.readLine().trim();
            // split line with coma separator
            String[] columnTitles = header.split(",");

            // assign table models to alter rows and columns later
            DefaultTableModel m = (DefaultTableModel) table.getModel();
            TableColumnModel cm = (TableColumnModel) table.getColumnModel();

            //set column identifiers
            m.setColumnIdentifiers(columnTitles);

            // Assign file lines to array
            Object[] tableRows = br.lines().toArray();

            // clear table rows before loading new ones
            for (int i = table.getRowCount() - 1; i >= 0; i--) {
                m.removeRow(i);
            }

            for (int i = 0; i < tableRows.length; i++) {
                // remove whitespace in line
                String line = tableRows[i].toString().replaceAll("\\s+", "");
                // if search input is "" load all accounts
                if (line != null && SearchTerm.equals("")) {
                    String[] dataRow = line.split("/");
                    m.addRow(dataRow);
                    // else if search input is not empty load accounts that contain search string
                } else if (line != null && line.contains(SearchTerm)) {
                    String[] dataRow = line.split("/");
                    m.addRow(dataRow);
                }

            }

            // if there is columns to delete, loop through array of column ID to delete them
            if (ColumnsToDelete.length > 0) {
                for (int i = 0; i < ColumnsToDelete.length; i++) {
                    table.removeColumn(table.getColumnModel().getColumn(ColumnsToDelete[i]));
                }
            }

            // disable table editing
            table.setDefaultEditor(Object.class, null);
            cm.getColumn(0).setPreferredWidth(1);

            br.close();

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Something went wrong...", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static int FindUnusedID(String FilePath) {
        int accId = 0;

        try {
            BufferedReader br = new BufferedReader(new FileReader(FilePath));

            //skip the first line of file with headers
            br.readLine();
            String line = null;

            for (line = br.readLine(); line != null; line = br.readLine()) {

                //remove whitespace and split by / char
                String[] parts = line.replaceAll("\\s+", "").split("/");

                // convert string accId to integer
                int tempAccId = Integer.parseInt(parts[0]);

                // find the largest accountId in the file
                if (tempAccId > accId) {
                    accId = tempAccId;
                }
            }

            // increment accId by 1
            accId = accId + 1;

            br.close();
        } catch (IOException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Something went wrong...", "Error", JOptionPane.ERROR_MESSAGE);
        }

        return accId;
    }

    public static void InsertLine(String FilePath, String[] values, String SuccessMessage) {
        try {
            FileWriter fw = new FileWriter(FilePath, true);

            // write new line into accounts file
            if (values.length > 0) {
                for (int i = 0; i < values.length; i++) {
                    if (i != values.length - 1) {
                        fw.write("" + values[i] + " / ");
                    } else {
                        fw.write(values[i]);
                    }

                }
            }

            // add empty line for future rows
            fw.write(System.getProperty("line.separator"));
            fw.close();

            JOptionPane.showMessageDialog(null, SuccessMessage, "Success", JOptionPane.INFORMATION_MESSAGE);

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Something went wrong...", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void DeleteLine(String FilePath, String SuccessMessage, Integer primary_at, String idToDelete) {
        File f = new File(FilePath);
        // create temp file
        File temp = new File(FilePath.replace(".txt", "") + "_temp.txt");

        try {
            BufferedReader br = new BufferedReader(new FileReader(f));
            BufferedWriter bw = new BufferedWriter(new FileWriter(temp));

            String line;

            //write file headers to temp file
            line = br.readLine();
            bw.write(line + System.getProperty("line.separator"));

            // loop through every line of the orifinal file
            while ((line = br.readLine()) != null) {
                // remove whitespace and split by / char
                String[] parts = line.replaceAll("\\s+", "").split("/");
                // get accountId from the line part

                String tempId = parts[primary_at];

                // if line's accountNumber equal to the one needed to be deleted skip it
                if (tempId.equals(idToDelete)) {
                    continue;
                }
                // if line is not skipped write it to temp file
                bw.write(line + System.getProperty("line.separator"));
            }

            bw.close();
            br.close();

            // delete original file and rename temp file to the original one
            f.delete();
            temp.renameTo(f);

            if (!SuccessMessage.equals("")) {
                JOptionPane.showMessageDialog(null, SuccessMessage, "Success", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Something went wrong...", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void EditLine(String FilePath, String SuccessMessage, Integer primary_at, String idToEdit, String[] NewValues) {
        DeleteLine(FilePath, "", primary_at, idToEdit);

        InsertLine(FilePath, NewValues, SuccessMessage);
    }
}
