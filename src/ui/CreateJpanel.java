/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import com.google.gson.Gson;
import java.io.FileReader;
import java.io.Reader;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import model.Car;
import model.Item;

/**
 *
 * @author ruchachauthai
 */
public class CreateJpanel extends javax.swing.JPanel {
    
    /**
     * Creates new form CreateJpanel
     */
    
    Item CarItemList;
    public CreateJpanel(Item CarItemList) {
        initComponents();
        //this.car = car;
        this.CarItemList = CarItemList;
        this.filterRow();
        populateCars();
        
    }

    //CreateJpanel(Car car) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   // }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        carType = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        modelName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        modelNumber = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        carmanufacturer = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        numberOfseats = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        serialNumber = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        maintenanceExpDate = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        availability = new javax.swing.JTextField();
        addCar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        deletebtn = new javax.swing.JButton();
        Vviewbtn = new javax.swing.JButton();
        updatebtn = new javax.swing.JButton();
        searchdropdown = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        yearOfManufacture = new javax.swing.JTextField();
        searchfield = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        city = new javax.swing.JTextField();
        Errormsg = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setBackground(new java.awt.Color(51, 51, 51));
        setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(102, 102, 255));
        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("                                                                                  UBER CONTROL PANEL");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Car Type");

        carType.setText("                    ");
        carType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carTypeActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Model Name");

        modelName.setText("                    ");

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Model Number");

        modelNumber.setText("                    ");
        modelNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modelNumberActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Car manufacturer");

        carmanufacturer.setText("                       ");

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Number Of Seats");

        numberOfseats.setText("                       ");
        numberOfseats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberOfseatsActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Serial Number");

        serialNumber.setText("                   ");
        serialNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serialNumberActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Maintenance Certificate  Expiry Date");

        maintenanceExpDate.setText("                      ");

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Availability");

        availability.setText("                    ");

        addCar.setBackground(new java.awt.Color(102, 102, 255));
        addCar.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        addCar.setForeground(new java.awt.Color(255, 255, 255));
        addCar.setText("ADD");
        addCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCarActionPerformed(evt);
            }
        });

        jTable2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 102, 102)));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Car Type", "Model Name", "Model Number", "Maintenance certificate expiry date", "Car manufacturer", "Number of seats", "Serial Number", "Availability", "Year of Manufacture", "City"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        deletebtn.setBackground(new java.awt.Color(102, 102, 255));
        deletebtn.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        deletebtn.setForeground(new java.awt.Color(255, 255, 255));
        deletebtn.setText("DELETE");
        deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtnActionPerformed(evt);
            }
        });

        Vviewbtn.setBackground(new java.awt.Color(102, 102, 255));
        Vviewbtn.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        Vviewbtn.setForeground(new java.awt.Color(255, 255, 255));
        Vviewbtn.setText("VIEW");
        Vviewbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VviewbtnActionPerformed(evt);
            }
        });

        updatebtn.setBackground(new java.awt.Color(102, 102, 255));
        updatebtn.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        updatebtn.setForeground(new java.awt.Color(255, 255, 255));
        updatebtn.setText("UPDATE");
        updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtnActionPerformed(evt);
            }
        });

        searchdropdown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select option to search", "Name of Manufacturer", "Number of Seats", "Serial Number", "Model Number", "Year of Manufacturing", "City", "Car Type", "Availability", "Maintenance Expiry" }));
        searchdropdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchdropdownActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Year Of Manufacture");

        searchfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchfieldActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("City");

        city.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityActionPerformed(evt);
            }
        });

        Errormsg.setForeground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(Errormsg)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(133, 133, 133)
                                .addComponent(searchdropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(city, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(carType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(modelName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(modelNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(maintenanceExpDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10))
                                .addGap(38, 38, 38)))
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(numberOfseats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(carmanufacturer)
                            .addComponent(serialNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchfield)
                            .addComponent(availability, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(yearOfManufacture, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(278, 278, 278)
                        .addComponent(addCar, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(Vviewbtn)
                        .addGap(55, 55, 55)
                        .addComponent(updatebtn)
                        .addGap(49, 49, 49)
                        .addComponent(deletebtn)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {availability, carType, carmanufacturer, city, maintenanceExpDate, modelName, modelNumber, numberOfseats, serialNumber, yearOfManufacture});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {Vviewbtn, addCar, deletebtn, searchdropdown, searchfield, updatebtn});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchdropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Errormsg))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(carType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(modelName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(modelNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7))
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(maintenanceExpDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(city, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(availability, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(yearOfManufacture, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(carmanufacturer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(numberOfseats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(serialNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(addCar)
                        .addComponent(Vviewbtn))
                    .addComponent(updatebtn)
                    .addComponent(deletebtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {availability, carType, carmanufacturer, city, maintenanceExpDate, modelName, modelNumber, numberOfseats, serialNumber, yearOfManufacture});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {Vviewbtn, addCar, deletebtn, searchdropdown, searchfield, updatebtn});

    }// </editor-fold>//GEN-END:initComponents

    private void carTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_carTypeActionPerformed

    private void serialNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serialNumberActionPerformed
        // TODO add your handling code here:
         String PATTERN = "^[0-9]{0,10}$";
        Pattern pattern = Pattern.compile(PATTERN);
        Matcher match = pattern.matcher(serialNumber.getText());
        if(!match.matches())
        {
            Errormsg.setText("Serial Number is incorrect!");
        }
        else{
            Errormsg.setText(null);
        }
    }//GEN-LAST:event_serialNumberActionPerformed

    private void deletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtnActionPerformed
        // TODO add your handling code here:
        //   model.deleteRow(row);
        int selectedRow = jTable2.getSelectedRow();
        if(selectedRow<0) {
            JOptionPane.showMessageDialog(this,"Please select a row to delete.");
            return;
        }
        DefaultTableModel model= (DefaultTableModel) jTable2.getModel();
        Car selectedCar= (Car)model.getValueAt(selectedRow,0);
        
        CarItemList.delete(selectedCar);
        populateCarTable();

    }//GEN-LAST:event_deletebtnActionPerformed

    private void addCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCarActionPerformed
        // TODO add your handling code here:
       
        //int noOfseats = 0;

        /*try{
            noOfseats = Integer.parseInt(numberOfseats.getText().trim());
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(this,"Please check the Number of seats format.","Info",JOptionPane.INFORMATION_MESSAGE);
            return;
        }*/
        if (!carType.getText().isEmpty() && !modelName.getText().isEmpty() && !modelNumber.getText().isEmpty()
                && !carmanufacturer.getText().isEmpty() && !serialNumber.getText().isEmpty() && !maintenanceExpDate.getText().isEmpty()
             && !city.getText().isEmpty() )
        {
          //  && availability.getDate()  != null
          Car check1 = CarItemList.getCarItemList().stream().filter(item -> Integer.parseInt(serialNumber.getText().trim())==item.getSerialNumber()).findFirst().orElse(null);
            
            if (check1 != null) {
                JOptionPane.showMessageDialog(this, "This Vehicle already exists!");
            }
            else{
        Car car = CarItemList.addCarItem();
        car.setCarType(carType.getText().trim());
        car.setModelName(modelName.getText().trim());
        car.setModelNumber(Integer.parseInt(modelNumber.getText().trim()));
        car.setCarmanufacturer(carmanufacturer.getText().trim());
        car.setNumberOfseats(Integer.parseInt(numberOfseats.getText().trim()));
        car.setSerialNumber(Integer.parseInt(serialNumber.getText().trim()));
        car.setMaintenanceExpDate(maintenanceExpDate.getText().trim());
        car.setAvailability(availability.getText().trim());
        car.setYearOfManufacture(yearOfManufacture.getText().trim());
        car.setCity(city.getText().trim());
        // car.setCarType(carType.getText());
        JOptionPane.showMessageDialog(this,"Car added successfully!","Info",JOptionPane.INFORMATION_MESSAGE);

        this.populateCarTable();
        
        carType.setText(" ");
        carmanufacturer.setText(" ");
        modelName.setText(" ");
        modelNumber.setText(" ");
        maintenanceExpDate.setText(" ");
        numberOfseats.setText(" ");
        serialNumber.setText(" ");
        availability.setText(" ");
        yearOfManufacture.setText(" ");
        city.setText(" ");
   // }
//        else{
//    JOptionPane.showMessageDialog(this,"Please fill in all the required fields.","Info",JOptionPane.INFORMATION_MESSAGE);
//}

    }//GEN-LAST:event_addCarActionPerformed
}
        else{
    JOptionPane.showMessageDialog(this,"Please fill in all the required fields.","Info",JOptionPane.INFORMATION_MESSAGE);
}
    }
    private void VviewbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VviewbtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = jTable2.getSelectedRow();
        if(selectedRow<0) {
            JOptionPane.showMessageDialog(this,"Please select a row to view.");
            return;
        }
        DefaultTableModel model= (DefaultTableModel) jTable2.getModel();
        Car selectedCar= (Car)model.getValueAt(selectedRow,0);
        
        
        carType.setText(selectedCar.getCarType());
        carmanufacturer.setText(selectedCar.getCarmanufacturer());
        modelName.setText(selectedCar.getModelName());
        modelNumber.setText(String.valueOf(selectedCar.getModelNumber()));
        maintenanceExpDate.setText(selectedCar.getMaintenanceExpDate());
        numberOfseats.setText(String.valueOf(selectedCar.getNumberOfseats()));
        serialNumber.setText(String.valueOf(selectedCar.getSerialNumber()));
        availability.setText(selectedCar.getAvailability());
        yearOfManufacture.setText(String.valueOf(selectedCar.getYearOfManufacture()));
        city.setText(selectedCar.getCity());
     //   dateExpiry.setDate(selectedCar.getMaiantenance_certificate_expiry_date());
    }//GEN-LAST:event_VviewbtnActionPerformed

    private void updatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtnActionPerformed
        // TODO add your handling code here:
         int selectedRow = jTable2.getSelectedRow();
        if(selectedRow<0) {
            JOptionPane.showMessageDialog(this,"Please select a row to update.");
            return;
        }
        DefaultTableModel model= (DefaultTableModel) jTable2.getModel();
        Car selectedCar= (Car)model.getValueAt(selectedRow,0);
        
        
        CarItemList.getCarItemList().get(selectedRow).setCarType(carType.getText().trim());
        CarItemList.getCarItemList().get(selectedRow).setModelName(modelName.getText().trim());
        CarItemList.getCarItemList().get(selectedRow).setModelNumber(Integer.parseInt(modelNumber.getText().trim()));
        CarItemList.getCarItemList().get(selectedRow).setCarmanufacturer(carmanufacturer.getText().trim());
        CarItemList.getCarItemList().get(selectedRow).setNumberOfseats(Integer.parseInt(numberOfseats.getText().trim()));
        CarItemList.getCarItemList().get(selectedRow).setSerialNumber(Integer.parseInt(serialNumber.getText().trim()));
        CarItemList.getCarItemList().get(selectedRow).setMaintenanceExpDate(maintenanceExpDate.getText().trim());
        CarItemList.getCarItemList().get(selectedRow).setAvailability(availability.getText().trim());
        CarItemList.getCarItemList().get(selectedRow).setYearOfManufacture(yearOfManufacture.getText().trim());
        CarItemList.getCarItemList().get(selectedRow).setCity(city.getText().trim());
        populateCarTable();
         JOptionPane.showMessageDialog(this,"Car details updated successfully!","Info",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_updatebtnActionPerformed

    private void searchfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchfieldActionPerformed

    private void searchdropdownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchdropdownActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchdropdownActionPerformed

    private void cityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityActionPerformed
        // TODO add your handling code here:
         String PATTERN = "^[a-zA-Z '/:]+$";
        Pattern pattern = Pattern.compile(PATTERN);
        Matcher match = pattern.matcher(city.getText());
        if(!match.matches())
        {
            Errormsg.setText("City format is incorrect!");
        }
        else{
            Errormsg.setText(null);
        }
    }//GEN-LAST:event_cityActionPerformed

    private void modelNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modelNumberActionPerformed
        // TODO add your handling code here:
         String PATTERN = "^[0-9]{0,10}$";
        Pattern pattern = Pattern.compile(PATTERN);
        Matcher match = pattern.matcher(modelNumber.getText());
        if(!match.matches())
        {
            Errormsg.setText("Model Number is incorrect!");
        }
        else{
            Errormsg.setText(null);
        }
    }//GEN-LAST:event_modelNumberActionPerformed

    private void numberOfseatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberOfseatsActionPerformed
        // TODO add your handling code here:
        String PATTERN = "^[0-9]{0,10}$";
        Pattern pattern = Pattern.compile(PATTERN);
        Matcher match = pattern.matcher(numberOfseats.getText());
        if(!match.matches())
        {
            Errormsg.setText("Model Number is incorrect!");
        }
        else{
            Errormsg.setText(null);
        }
        
    }//GEN-LAST:event_numberOfseatsActionPerformed
private void populateCarTable(){
DefaultTableModel model=(DefaultTableModel) jTable2.getModel();
   model.setRowCount(0);
   
    
    for(Car car: CarItemList.getCarItemList()){
     Object row[] = new Object [10];
     row[0]=car;
     row[1]=car.getModelName();
     row[2]=car.getModelNumber();
     row[3]=car.getMaintenanceExpDate();
     row[4]=car.getCarmanufacturer();
     row[5]=car.getNumberOfseats();
     row[6]=car.getSerialNumber();
     row[7]=car.getAvailability();
     row[8]=car.getYearOfManufacture();
     row[9]=car.getCity();
     model.addRow(row);
   }
}
private void populateCars(){
        try{
        Reader r1= new FileReader("cardata.json");
        Gson gsonparser= new Gson();
        Car[] data= gsonparser.fromJson(r1,Car[].class);
        Collections.addAll(CarItemList.getCarItemList(),data);
        populateCarTable();
    }catch(Exception e){
        System.out.println(e.getMessage());
        JOptionPane.showMessageDialog(this,"Data cannot be imported");
    }
    }

private void filterRow(){
    System.out.println("inside");
    TableModel myTableModel = jTable2.getModel();
    final TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(myTableModel);
    jTable2.setRowSorter(sorter);
    searchfield.getDocument().addDocumentListener(new DocumentListener(){
    private void searchUpdate(DocumentEvent evt){
    int index =0;
    String option = searchdropdown.getSelectedItem().toString();
    switch(option){
                        case "Name of Manufacturer": index=4;
                        break;
                        case "Number of Seats": index=5;
                        break;
                        case "Serial Number": index=6;
                        break;
                        case "Model Number": index=2;
                        break;
                        case "Year of Manufacturing": index=8;
                        break;
                        case "City": index=9;
                        break;
                        case "Car Type": index=0;
                        break;
                        case "Availability": index=7;
                        break;
                        case "Maintenance Expiry": index=3;
                        break;
                       // row[1]=car.getModelName();
//     row[2]=car.getModelNumber();
//     row[3]=car.getMaintenanceExpDate();
//     row[4]=car.getCarmanufacturer();
//     row[5]=car.getNumberOfseats();
//     row[6]=car.getSerialNumber();
//     row[7]=car.getAvailability();
//     row[8]=car.getYearOfManufacture();
//     row[9]=car.getCity();
//                        case "maintenanceExpDate": index=6;
//                        break;
//                        case "availability": index=7;
//                        break;
//                        case "yearOfManufacture": index=8;
//                        break;
//                        case "city": index=9;
//                        break;
        
    }
    String txt =searchfield.getText();
    if(txt.length()==0){
    sorter.setRowFilter(null);
    jTable2.clearSelection();
    }else{
        try{
            sorter.setRowFilter(RowFilter.regexFilter("(?i)"+txt,index));
     //   sorter.setRowFilter(RowFilter.regexFilter("(?i)")+txt, index);
        jTable2.clearSelection();
        }
        catch(PatternSyntaxException pse){
        JOptionPane.showMessageDialog(null,"Bad regex pattern","Bad regex pattern",JOptionPane.ERROR_MESSAGE);
        }
    }
    }
    @Override
    public void insertUpdate(DocumentEvent e){
    searchUpdate(e);
    }
    @Override
    public void removeUpdate(DocumentEvent e){
    searchUpdate(e);
    }
    @Override
    public void changedUpdate(DocumentEvent e){
    searchUpdate(e);
    }
    });
}
//private void getCarItemList(){
//    DefaultTableModel model=(DefaultTableModel) jTable2.getModel();
//     model.setRowCount(0);
//     Object row[] = new Object [8];
//     row[0]=car.getCarType();
//     row[1]=car.getModelName();
//     row[2]=car.getModelNumber();
//     row[3]=car.getMaintenanceExpDate();
//     row[4]=car.getCarmanufacturer();
//     row[5]=car.getNumberOfseats();
//     row[6]=car.getSerialNumber();
//     row[7]=car.getAvailability();
//     model.addRow(row);
//}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Errormsg;
    private javax.swing.JButton Vviewbtn;
    private javax.swing.JButton addCar;
    private javax.swing.JTextField availability;
    private javax.swing.JTextField carType;
    private javax.swing.JTextField carmanufacturer;
    private javax.swing.JTextField city;
    private javax.swing.JButton deletebtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField maintenanceExpDate;
    private javax.swing.JTextField modelName;
    private javax.swing.JTextField modelNumber;
    private javax.swing.JTextField numberOfseats;
    private javax.swing.JComboBox<String> searchdropdown;
    private javax.swing.JTextField searchfield;
    private javax.swing.JTextField serialNumber;
    private javax.swing.JButton updatebtn;
    private javax.swing.JTextField yearOfManufacture;
    // End of variables declaration//GEN-END:variables

    private static class tblView {

        public tblView() {
            
        }
    }
}
