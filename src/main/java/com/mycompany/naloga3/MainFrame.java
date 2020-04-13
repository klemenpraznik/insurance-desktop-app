/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.naloga3;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.StringWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerDateModel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.Timer;
import jdk.nashorn.internal.ir.BreakNode;

/**
 *
 * @author Klemen
 */
public class MainFrame extends javax.swing.JFrame {
    
    public MainFrame() {
        initComponents();
        birthdateDatePicker = createDateSpinner(birthdateDatePicker, Calendar.getInstance());
        firstRegistrationDatePicker = createDateSpinner(firstRegistrationDatePicker, Calendar.getInstance());
        youngDriverCheckBox.setHorizontalTextPosition(SwingConstants.LEFT);     
    }
    
    private JSpinner createDateSpinner(JSpinner spinner, Calendar calendar){
        Date initDate = calendar.getTime();
        calendar.add(Calendar.YEAR, -100);
        Date earliestDate = calendar.getTime();
        calendar.add(Calendar.YEAR, 200);
        Date latestDate = calendar.getTime();
        SpinnerDateModel spinnerDateModel = new SpinnerDateModel(initDate, earliestDate, latestDate, Calendar.YEAR);
        spinner.setEditor(new JSpinner.DateEditor(spinner, "dd.MM.yyyy"));
        spinner.setName("date-spinner");
        return spinner;
    }
    
    private boolean verifyTextField(JTextField field){
        if (field.getText().length() > 0){
            field.setBorder(javax.swing.UIManager.getBorder("TextField.border"));
            return true;
        }
        else {
            field.setBorder(new LineBorder(Color.red, 1));
            return false;
        }
    }
    
    private boolean verifyNumber(JTextField field){
        if (field.getText().toString().matches("^[0-9]*$")){
            field.setBorder(javax.swing.UIManager.getBorder("TextField.border"));
            return true;
        }
        else {
            field.setBorder(new LineBorder(Color.red, 1));
            return false;
        }
    }
    
    private String getCity (String postnumber){
        switch(postnumber.charAt(0)){
            case '1':
                return "Ljubljana";
            case '2':
                return "Maribor";
            case '3':
                return "Celje";
            case '4':
                return "Kranj";
            case '5':
                return "Nova Gorica";
            case '6':
                return "Koper";
            case '8':
                return "Nova mesto";
            case '9':
                return "Muska Sobota";     
            default:
                return "";
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        defaultInsuranceButtonGroup = new javax.swing.ButtonGroup();
        kaskoButtonGroup = new javax.swing.ButtonGroup();
        fileChooser = new javax.swing.JFileChooser();
        statusBar = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();
        bottomPanel = new javax.swing.JPanel();
        saveButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        gridLayout = new javax.swing.JPanel();
        insureePanel = new javax.swing.JPanel();
        nameLabel = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        surenameLabel = new javax.swing.JLabel();
        surenameTextField = new javax.swing.JTextField();
        addressLabel = new javax.swing.JLabel();
        addressTextField = new javax.swing.JTextField();
        postNumberLabel = new javax.swing.JLabel();
        postNumberTextField = new javax.swing.JTextField();
        cityLabel = new javax.swing.JLabel();
        cityTextField = new javax.swing.JTextField();
        dayLabel = new javax.swing.JLabel();
        birthdateDatePicker = new javax.swing.JSpinner();
        youngDriverCheckBox = new javax.swing.JCheckBox();
        vehiclePanel = new javax.swing.JPanel();
        brandLabel = new javax.swing.JLabel();
        brandTextField = new javax.swing.JTextField();
        modelLabel = new javax.swing.JLabel();
        modelTextField = new javax.swing.JTextField();
        transmissionLabel = new javax.swing.JLabel();
        transmissionComboBox = new javax.swing.JComboBox<>();
        fuelTypeLabel = new javax.swing.JLabel();
        fuelTypeComboBox = new javax.swing.JComboBox<>();
        volumeLabel = new javax.swing.JLabel();
        volumeSpinner = new javax.swing.JSpinner();
        powerLabel = new javax.swing.JLabel();
        powerSpinner = new javax.swing.JSpinner();
        doorsLabel = new javax.swing.JLabel();
        doorsComboBox = new javax.swing.JComboBox<>();
        seatsLabel = new javax.swing.JLabel();
        seatsComboBox = new javax.swing.JComboBox<>();
        vehicleTypeLabel = new javax.swing.JLabel();
        vehicleTypeComboBox = new javax.swing.JComboBox<>();
        jSeparator2 = new javax.swing.JSeparator();
        firstRegistraionLabel = new javax.swing.JLabel();
        firstRegistrationDatePicker = new javax.swing.JSpinner();
        registrationNumberLabel = new javax.swing.JLabel();
        registrionNumberTextField = new javax.swing.JTextField();
        insurancePanel = new javax.swing.JPanel();
        defaultInsuranceLabelLabel = new javax.swing.JLabel();
        AORadioButton = new javax.swing.JRadioButton();
        AOPlusRadioButton = new javax.swing.JRadioButton();
        kaskoLabel = new javax.swing.JLabel();
        noKaskoRadioButton = new javax.swing.JRadioButton();
        deductableKaskoRadioButton = new javax.swing.JRadioButton();
        fullKaskoRadioButton = new javax.swing.JRadioButton();
        additionalInsuranceLabel = new javax.swing.JLabel();
        steklaCheckBox = new javax.swing.JCheckBox();
        parkingCheckBox = new javax.swing.JCheckBox();
        potnikiCheckBox = new javax.swing.JCheckBox();
        tretjaOsebaCheckBox1 = new javax.swing.JCheckBox();
        gumeCheckBox = new javax.swing.JCheckBox();
        protiKrajiCheckBox = new javax.swing.JCheckBox();
        tocaCheckBox = new javax.swing.JCheckBox();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("N'Č BAT - Aplikacija za zavarovanje avtomobilov");
        setBackground(new java.awt.Color(51, 51, 51));
        setMinimumSize(new java.awt.Dimension(720, 700));
        setPreferredSize(new java.awt.Dimension(730, 637));

        statusBar.setBackground(new java.awt.Color(51, 51, 51));
        statusBar.setForeground(new java.awt.Color(255, 51, 51));
        statusBar.setText(" ");
        statusBar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        getContentPane().add(statusBar, java.awt.BorderLayout.PAGE_END);

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainPanel.setLayout(new java.awt.BorderLayout());

        bottomPanel.setBackground(new java.awt.Color(255, 255, 255));
        bottomPanel.setFocusTraversalPolicyProvider(true);
        bottomPanel.setMinimumSize(new java.awt.Dimension(0, 60));
        bottomPanel.setName(""); // NOI18N
        bottomPanel.setPreferredSize(new java.awt.Dimension(717, 60));

        saveButton.setBackground(new java.awt.Color(40, 167, 69));
        saveButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        saveButton.setForeground(new java.awt.Color(255, 255, 255));
        saveButton.setMnemonic('S');
        saveButton.setText("Shrani");
        saveButton.setMargin(new java.awt.Insets(5, 15, 5, 15));
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveDocument(evt);
            }
        });

        clearButton.setBackground(new java.awt.Color(255, 193, 7));
        clearButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        clearButton.setForeground(new java.awt.Color(255, 255, 255));
        clearButton.setText("Počisti");
        clearButton.setMargin(new java.awt.Insets(5, 15, 5, 15));
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearAll(evt);
            }
        });

        javax.swing.GroupLayout bottomPanelLayout = new javax.swing.GroupLayout(bottomPanel);
        bottomPanel.setLayout(bottomPanelLayout);
        bottomPanelLayout.setHorizontalGroup(
            bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bottomPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(clearButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 561, Short.MAX_VALUE)
                .addComponent(saveButton)
                .addContainerGap())
        );
        bottomPanelLayout.setVerticalGroup(
            bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bottomPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clearButton)
                    .addComponent(saveButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mainPanel.add(bottomPanel, java.awt.BorderLayout.PAGE_END);

        gridLayout.setBackground(new java.awt.Color(255, 255, 255));
        gridLayout.setForeground(new java.awt.Color(102, 102, 102));
        gridLayout.setMinimumSize(new java.awt.Dimension(0, 540));
        gridLayout.setPreferredSize(new java.awt.Dimension(693, 540));
        gridLayout.setLayout(new java.awt.GridLayout(3, 1));

        insureePanel.setBackground(new java.awt.Color(255, 255, 255));
        insureePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(1, 5, 1, 1, new java.awt.Color(102, 102, 102)), "Podatki o zavarovancu", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(102, 102, 102))); // NOI18N
        insureePanel.setForeground(new java.awt.Color(51, 51, 51));
        insureePanel.setAutoscrolls(true);
        insureePanel.setMinimumSize(new java.awt.Dimension(0, 200));
        insureePanel.setPreferredSize(new java.awt.Dimension(693, 180));
        insureePanel.setVerifyInputWhenFocusTarget(false);
        insureePanel.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                insureePanelFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                verifyInsureePanel(evt);
            }
        });

        nameLabel.setText("Ime");

        nameTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                nameTextFieldFocusLost(evt);
            }
        });

        surenameLabel.setText("Priimek");

        surenameTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                surenameTextFieldFocusLost(evt);
            }
        });

        addressLabel.setText("Naslov");

        addressTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                addressTextFieldFocusLost(evt);
            }
        });

        postNumberLabel.setText("Poštna št.");

        postNumberTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                postNumberTextFieldFocusLost(evt);
            }
        });

        cityLabel.setText("Kraj");

        cityTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cityTextFieldFocusLost(evt);
            }
        });

        dayLabel.setText("Datum rojstva");

        birthdateDatePicker.setModel(new javax.swing.SpinnerDateModel());
        birthdateDatePicker.setEditor(new javax.swing.JSpinner.DateEditor(birthdateDatePicker, ""));
        birthdateDatePicker.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                birthdateDatePickerStateChanged(evt);
            }
        });
        birthdateDatePicker.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                birthdateDatePickerFocusLost(evt);
            }
        });

        youngDriverCheckBox.setBackground(new java.awt.Color(255, 255, 255));
        youngDriverCheckBox.setText("Mladi voznik   ");
        youngDriverCheckBox.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        youngDriverCheckBox.setMargin(new java.awt.Insets(2, 2, 2, 3));

        javax.swing.GroupLayout insureePanelLayout = new javax.swing.GroupLayout(insureePanel);
        insureePanel.setLayout(insureePanelLayout);
        insureePanelLayout.setHorizontalGroup(
            insureePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(insureePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(insureePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(insureePanelLayout.createSequentialGroup()
                        .addGroup(insureePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(nameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(postNumberLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                            .addComponent(addressLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(insureePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(insureePanelLayout.createSequentialGroup()
                                .addComponent(nameTextField)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(surenameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(surenameTextField)
                                .addGap(18, 18, 18)
                                .addComponent(dayLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(birthdateDatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(insureePanelLayout.createSequentialGroup()
                                .addComponent(postNumberTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(cityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cityTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE))
                            .addComponent(addressTextField)))
                    .addGroup(insureePanelLayout.createSequentialGroup()
                        .addComponent(youngDriverCheckBox)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        insureePanelLayout.setVerticalGroup(
            insureePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(insureePanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(insureePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(surenameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(surenameLabel)
                    .addComponent(dayLabel)
                    .addComponent(birthdateDatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(insureePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(insureePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(postNumberLabel)
                    .addComponent(postNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cityLabel)
                    .addComponent(cityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(youngDriverCheckBox)
                .addGap(67, 67, 67))
        );

        gridLayout.add(insureePanel);

        vehiclePanel.setBackground(new java.awt.Color(255, 255, 255));
        vehiclePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(1, 5, 1, 1, new java.awt.Color(102, 102, 102)), "Podatki o vozilu", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(102, 102, 102))); // NOI18N
        vehiclePanel.setForeground(new java.awt.Color(102, 102, 102));
        vehiclePanel.setPreferredSize(new java.awt.Dimension(693, 180));

        brandLabel.setText("Znamka");

        brandTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                brandTextFieldFocusLost(evt);
            }
        });

        modelLabel.setText("Model");

        modelTextField.setBackground(new java.awt.Color(255, 255, 255));
        modelTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                modelTextFieldFocusLost(evt);
            }
        });

        transmissionLabel.setText("Menjalnik");

        transmissionComboBox.setBackground(new java.awt.Color(255, 255, 255));
        transmissionComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ročni", "samodejni" }));

        fuelTypeLabel.setText("Gorivo");

        fuelTypeComboBox.setBackground(new java.awt.Color(255, 255, 255));
        fuelTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "bencin", "diesel", "plin", "hibrid", "elektrika" }));

        volumeLabel.setText("Prostornina");
        volumeLabel.setToolTipText("v cmm");

        volumeSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10000, 1));

        powerLabel.setText("Moč");

        powerSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10000, 1));

        doorsLabel.setText("Št. vrat");

        doorsComboBox.setBackground(new java.awt.Color(255, 255, 255));
        doorsComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2 / 3", "4 / 5", "6 / 7" }));

        seatsLabel.setText("Sedeži");

        seatsComboBox.setBackground(new java.awt.Color(255, 255, 255));
        seatsComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 ali 2", "3 - 5", "6 ali več" }));

        vehicleTypeLabel.setText("Tip");

        vehicleTypeComboBox.setBackground(new java.awt.Color(255, 255, 255));
        vehicleTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "limuzina", "kombiliuzina", "karavan", "enoprostorec", "coupe", "cabrio", "SUV / terenski", "pick-up" }));

        jSeparator2.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator2.setForeground(new java.awt.Color(51, 51, 51));

        firstRegistraionLabel.setText("Datum prve registracije");

        firstRegistrationDatePicker.setModel(new javax.swing.SpinnerDateModel());
        firstRegistrationDatePicker.setEditor(new javax.swing.JSpinner.DateEditor(firstRegistrationDatePicker, ""));

        registrationNumberLabel.setText("Registracijska oznaka");

        registrionNumberTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                registrionNumberTextFieldFocusLost(evt);
            }
        });

        javax.swing.GroupLayout vehiclePanelLayout = new javax.swing.GroupLayout(vehiclePanel);
        vehiclePanel.setLayout(vehiclePanelLayout);
        vehiclePanelLayout.setHorizontalGroup(
            vehiclePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vehiclePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(vehiclePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2)
                    .addGroup(vehiclePanelLayout.createSequentialGroup()
                        .addGroup(vehiclePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(vehiclePanelLayout.createSequentialGroup()
                                .addComponent(vehicleTypeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(vehicleTypeComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(vehiclePanelLayout.createSequentialGroup()
                                .addGroup(vehiclePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(brandLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(volumeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(vehiclePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(volumeSpinner)
                                    .addComponent(brandTextField))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(vehiclePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, vehiclePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(powerLabel)
                                .addComponent(modelLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(doorsLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(vehiclePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(modelTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(doorsComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(powerSpinner, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(30, 30, 30)
                        .addGroup(vehiclePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(transmissionLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fuelTypeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(seatsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(vehiclePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(seatsComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fuelTypeComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(transmissionComboBox, 0, 178, Short.MAX_VALUE)))
                    .addGroup(vehiclePanelLayout.createSequentialGroup()
                        .addComponent(firstRegistraionLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(firstRegistrationDatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(registrationNumberLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(registrionNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 96, Short.MAX_VALUE)))
                .addContainerGap())
        );
        vehiclePanelLayout.setVerticalGroup(
            vehiclePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vehiclePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(vehiclePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(brandTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(brandLabel)
                    .addComponent(modelLabel)
                    .addComponent(modelTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(transmissionLabel)
                    .addComponent(transmissionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(vehiclePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fuelTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fuelTypeLabel)
                    .addComponent(volumeLabel)
                    .addComponent(powerLabel)
                    .addComponent(volumeSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(powerSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(vehiclePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(doorsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(doorsLabel)
                    .addComponent(seatsLabel)
                    .addComponent(seatsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vehicleTypeLabel)
                    .addComponent(vehicleTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(vehiclePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstRegistraionLabel)
                    .addComponent(firstRegistrationDatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registrationNumberLabel)
                    .addComponent(registrionNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        gridLayout.add(vehiclePanel);

        insurancePanel.setBackground(new java.awt.Color(255, 255, 255));
        insurancePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(1, 5, 1, 1, new java.awt.Color(102, 102, 102)), "Podatki o zavarovanju", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(102, 102, 102))); // NOI18N
        insurancePanel.setForeground(new java.awt.Color(102, 102, 102));
        insurancePanel.setAutoscrolls(true);
        insurancePanel.setPreferredSize(new java.awt.Dimension(693, 180));

        defaultInsuranceLabelLabel.setText("Osnovno zavarovanje");

        AORadioButton.setBackground(new java.awt.Color(255, 255, 255));
        defaultInsuranceButtonGroup.add(AORadioButton);
        AORadioButton.setSelected(true);
        AORadioButton.setText("AO");

        AOPlusRadioButton.setBackground(new java.awt.Color(255, 255, 255));
        defaultInsuranceButtonGroup.add(AOPlusRadioButton);
        AOPlusRadioButton.setText("AO+");

        kaskoLabel.setText("Kasko");

        noKaskoRadioButton.setBackground(new java.awt.Color(255, 255, 255));
        kaskoButtonGroup.add(noKaskoRadioButton);
        noKaskoRadioButton.setSelected(true);
        noKaskoRadioButton.setText("Brez");

        deductableKaskoRadioButton.setBackground(new java.awt.Color(255, 255, 255));
        kaskoButtonGroup.add(deductableKaskoRadioButton);
        deductableKaskoRadioButton.setText("Odbitna franšiza");

        fullKaskoRadioButton.setBackground(new java.awt.Color(255, 255, 255));
        kaskoButtonGroup.add(fullKaskoRadioButton);
        fullKaskoRadioButton.setText("Polno");

        additionalInsuranceLabel.setText("Dodatno zavarovanje");

        steklaCheckBox.setBackground(new java.awt.Color(255, 255, 255));
        steklaCheckBox.setText("Zavarovanje stekel");

        parkingCheckBox.setBackground(new java.awt.Color(255, 255, 255));
        parkingCheckBox.setText("Zavarovanje na parkirišču");

        potnikiCheckBox.setBackground(new java.awt.Color(255, 255, 255));
        potnikiCheckBox.setText("Zavarovanje potnikov");

        tretjaOsebaCheckBox1.setBackground(new java.awt.Color(255, 255, 255));
        tretjaOsebaCheckBox1.setText("Zavarovanje tretje osebe");

        gumeCheckBox.setBackground(new java.awt.Color(255, 255, 255));
        gumeCheckBox.setText("Zavarovanje pnevmatik");

        protiKrajiCheckBox.setBackground(new java.awt.Color(255, 255, 255));
        protiKrajiCheckBox.setText("Zavarovanje proti kraji");

        tocaCheckBox.setBackground(new java.awt.Color(255, 255, 255));
        tocaCheckBox.setText("Zavarovanje proti toči");

        javax.swing.GroupLayout insurancePanelLayout = new javax.swing.GroupLayout(insurancePanel);
        insurancePanel.setLayout(insurancePanelLayout);
        insurancePanelLayout.setHorizontalGroup(
            insurancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(insurancePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(insurancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(additionalInsuranceLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(defaultInsuranceLabelLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(kaskoLabel, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(18, 18, 18)
                .addGroup(insurancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(insurancePanelLayout.createSequentialGroup()
                        .addGroup(insurancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(steklaCheckBox)
                            .addGroup(insurancePanelLayout.createSequentialGroup()
                                .addGroup(insurancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(noKaskoRadioButton)
                                    .addComponent(AORadioButton))
                                .addGap(30, 30, 30)
                                .addGroup(insurancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fullKaskoRadioButton)
                                    .addComponent(AOPlusRadioButton))))
                        .addGap(41, 41, 41)
                        .addGroup(insurancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(insurancePanelLayout.createSequentialGroup()
                                .addComponent(deductableKaskoRadioButton)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(insurancePanelLayout.createSequentialGroup()
                                .addComponent(parkingCheckBox)
                                .addGap(18, 18, 18)
                                .addGroup(insurancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(potnikiCheckBox)
                                    .addComponent(protiKrajiCheckBox))
                                .addGap(0, 81, Short.MAX_VALUE))))
                    .addGroup(insurancePanelLayout.createSequentialGroup()
                        .addGroup(insurancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(insurancePanelLayout.createSequentialGroup()
                                .addComponent(tretjaOsebaCheckBox1)
                                .addGap(18, 18, 18)
                                .addComponent(gumeCheckBox))
                            .addComponent(tocaCheckBox))
                        .addContainerGap())))
        );
        insurancePanelLayout.setVerticalGroup(
            insurancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(insurancePanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(insurancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(defaultInsuranceLabelLabel)
                    .addComponent(AORadioButton)
                    .addComponent(AOPlusRadioButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(insurancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kaskoLabel)
                    .addComponent(noKaskoRadioButton)
                    .addComponent(deductableKaskoRadioButton)
                    .addComponent(fullKaskoRadioButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(insurancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(steklaCheckBox)
                    .addComponent(additionalInsuranceLabel)
                    .addComponent(parkingCheckBox)
                    .addComponent(protiKrajiCheckBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(insurancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tretjaOsebaCheckBox1)
                    .addComponent(gumeCheckBox)
                    .addComponent(potnikiCheckBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tocaCheckBox)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        gridLayout.add(insurancePanel);

        mainPanel.add(gridLayout, java.awt.BorderLayout.CENTER);

        getContentPane().add(mainPanel, java.awt.BorderLayout.CENTER);

        jMenu1.setMnemonic('D');
        jMenu1.setText("Datoteka");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Shrani");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Izhod");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setMnemonic('U');
        jMenu2.setText("Uredi");

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("Počisti vnose");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearAll(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setText("Preveri veljavnost");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuBar1.add(jMenu2);

        jMenu3.setMnemonic('P');
        jMenu3.setText("Pomoč");

        jMenuItem4.setMnemonic('O');
        jMenuItem4.setText("O avtorju");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void insureePanelFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_insureePanelFocusGained
    }//GEN-LAST:event_insureePanelFocusGained

    private void verifyInsureePanel(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_verifyInsureePanel
    }//GEN-LAST:event_verifyInsureePanel

    private void nameTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameTextFieldFocusLost
        if (verifyTextField(nameTextField)){
            statusBar.setText(" ");
        }
        else {
            statusBar.setForeground(Color.red);
            statusBar.setText("Polje 'Ime' mora biti izpolnjeno.");
        }
    }//GEN-LAST:event_nameTextFieldFocusLost

    private void surenameTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_surenameTextFieldFocusLost
        if (verifyTextField(surenameTextField)){
            statusBar.setText(" ");
        }
        else {
            statusBar.setForeground(Color.red);
            statusBar.setText("Polje 'Priimek' mora biti izpolnjeno.");
        }
    }//GEN-LAST:event_surenameTextFieldFocusLost

    private void addressTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_addressTextFieldFocusLost
        if (verifyTextField(addressTextField)){
            statusBar.setText(" ");
        }
        else {
            statusBar.setForeground(Color.red);
            statusBar.setText("Polje 'Naslov' mora biti izpolnjeno.");
        }
    }//GEN-LAST:event_addressTextFieldFocusLost

    private void postNumberTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_postNumberTextFieldFocusLost
        if (postNumberTextField.getText().length() <= 0){
            postNumberTextField.setBorder(new LineBorder(Color.red, 1));
            statusBar.setForeground(Color.red);
            statusBar.setText("Polje 'Poštna številka' mora biti izpolnjeno.");
        } 
        else if (postNumberTextField.getText().length() > 4){
            postNumberTextField.setBorder(new LineBorder(Color.red, 1));
            statusBar.setForeground(Color.red);
            statusBar.setText("Polje 'Poštna številka' ne sme biti daljša od 4 znakov.");
        }
        else if (verifyNumber(postNumberTextField)){
            if (Integer.parseInt(postNumberTextField.getText()) < 1000){
                postNumberTextField.setBorder(new LineBorder(Color.red, 1));
                statusBar.setForeground(Color.red);
                statusBar.setText("Polje 'Poštna številka' ne more biti manjša od 1000.");
            }
            else {
                statusBar.setText(" ");
                cityTextField.setText(getCity(postNumberTextField.getText()));
            }
        }
        else {
            postNumberTextField.setBorder(new LineBorder(Color.red, 1));
            statusBar.setForeground(Color.red);
            statusBar.setText("Polje 'Poštna številka' lahko vsebuje samo števila.");
        }
    }//GEN-LAST:event_postNumberTextFieldFocusLost

    private void cityTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cityTextFieldFocusLost
        if (verifyTextField(cityTextField)){
            statusBar.setText(" ");
        }
        else {
            statusBar.setForeground(Color.red);
            statusBar.setText("Polje 'Kraj' mora biti izpolnjeno.");
        }
    }//GEN-LAST:event_cityTextFieldFocusLost

    private void brandTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_brandTextFieldFocusLost
        if (verifyTextField(brandTextField)){
            statusBar.setText(" ");
        }
        else {
            statusBar.setForeground(Color.red);
            statusBar.setText("Polje 'Znamka' mora biti izpolnjeno.");
        }
    }//GEN-LAST:event_brandTextFieldFocusLost

    private void modelTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_modelTextFieldFocusLost
        if (verifyTextField(modelTextField)){
            statusBar.setText(" ");
        }
        else {
            statusBar.setForeground(Color.red);
            statusBar.setText("Polje 'Model' mora biti izpolnjeno.");
        }
    }//GEN-LAST:event_modelTextFieldFocusLost

    private void birthdateDatePickerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_birthdateDatePickerStateChanged
 
    }//GEN-LAST:event_birthdateDatePickerStateChanged

    private void birthdateDatePickerFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_birthdateDatePickerFocusLost

    }//GEN-LAST:event_birthdateDatePickerFocusLost

    private void clearAll(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearAll
        int dialogResult = JOptionPane.showConfirmDialog (null, "Ali ste prepričani, da želite počistiti vsa polja?","Opozorilo", JOptionPane.YES_NO_OPTION);
        if(dialogResult == JOptionPane.YES_OPTION){
            nameTextField.setText("");
            nameTextField.setBorder(javax.swing.UIManager.getBorder("TextField.border"));
            nameTextField.requestFocus();
            surenameTextField.setText("");
            surenameTextField.setBorder(javax.swing.UIManager.getBorder("TextField.border"));
            Calendar calendar = Calendar.getInstance();
            Date initDate = calendar.getTime();
            birthdateDatePicker.setValue(initDate);
            birthdateDatePicker.setBorder(javax.swing.UIManager.getBorder("TextField.border"));
            firstRegistrationDatePicker.setValue(initDate);
            firstRegistrationDatePicker.setBorder(javax.swing.UIManager.getBorder("TextField.border"));
            addressTextField.setText("");
            addressTextField.setBorder(javax.swing.UIManager.getBorder("TextField.border"));
            postNumberTextField.setText("");
            postNumberTextField.setBorder(javax.swing.UIManager.getBorder("TextField.border"));
            cityTextField.setText("");
            cityTextField.setBorder(javax.swing.UIManager.getBorder("TextField.border"));
            youngDriverCheckBox.setSelected(false);
            brandTextField.setText("");
            brandTextField.setBorder(javax.swing.UIManager.getBorder("TextField.border"));
            modelTextField.setText("");
            modelTextField.setBorder(javax.swing.UIManager.getBorder("TextField.border"));
            transmissionComboBox.setSelectedIndex(0);
            volumeSpinner.setValue(0);
            powerSpinner.setValue(0);
            fuelTypeComboBox.setSelectedIndex(0);
            vehicleTypeComboBox.setSelectedIndex(0);
            doorsComboBox.setSelectedIndex(0);
            seatsComboBox.setSelectedIndex(0);
            registrionNumberTextField.setText("");
            registrionNumberTextField.setBorder(javax.swing.UIManager.getBorder("TextField.border"));
            AORadioButton.setSelected(true);
            noKaskoRadioButton.setSelected(true);
            steklaCheckBox.setSelected(false);
            parkingCheckBox.setSelected(false);
            protiKrajiCheckBox.setSelected(false);
            tretjaOsebaCheckBox1.setSelected(false);
            gumeCheckBox.setSelected(false);
            potnikiCheckBox.setSelected(false);
            tocaCheckBox.setSelected(false);
            statusBar.setForeground(Color.black);
            statusBar.setText("Podatki so bili počiščeni.");
        }
    }//GEN-LAST:event_clearAll

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        statusBar.setForeground(Color.black);
        statusBar.setText("Avtor: Klemen Praznik");
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void registrionNumberTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_registrionNumberTextFieldFocusLost
        if (verifyTextField(registrionNumberTextField)){
            statusBar.setText(" ");
        }
        else {
            statusBar.setForeground(Color.red);
            statusBar.setText("Polje 'Registracijska številka' mora biti izpolnjeno.");
        }
    }//GEN-LAST:event_registrionNumberTextFieldFocusLost

    private boolean validateForm(){
        boolean isValid = true;
        if (!verifyTextField(nameTextField)){
            statusBar.setForeground(Color.red);
            statusBar.setText("Polje 'Ime' mora biti izpolnjeno.");
            isValid = false;
        }
        if (!verifyTextField(surenameTextField)){
            statusBar.setForeground(Color.red);
            statusBar.setText("Polje 'Priimek' mora biti izpolnjeno.");
            isValid = false;
        }
        if (!verifyTextField(addressTextField)){
            statusBar.setForeground(Color.red);
            statusBar.setText("Polje 'Naslov' mora biti izpolnjeno.");
            isValid = false;
        }
        if (postNumberTextField.getText().length() <= 0){
            postNumberTextField.setBorder(new LineBorder(Color.red, 1));
            statusBar.setForeground(Color.red);
            statusBar.setText("Polje 'Poštna številka' mora biti izpolnjeno.");
        } 
            else if (postNumberTextField.getText().length() > 4){
                postNumberTextField.setBorder(new LineBorder(Color.red, 1));
                statusBar.setForeground(Color.red);
                statusBar.setText("Polje 'Poštna številka' ne sme biti daljša od 4 znakov.");
            }
            else if (verifyNumber(postNumberTextField)){
                if (Integer.parseInt(postNumberTextField.getText()) < 1000){
                    postNumberTextField.setBorder(new LineBorder(Color.red, 1));
                    statusBar.setForeground(Color.red);
                    statusBar.setText("Polje 'Poštna številka' ne more biti manjša od 1000.");
                }
                else {
                    statusBar.setText(" ");
                    cityTextField.setText(getCity(postNumberTextField.getText()));
                }
            }
            else {
                postNumberTextField.setBorder(new LineBorder(Color.red, 1));
                statusBar.setForeground(Color.red);
                statusBar.setText("Polje 'Poštna številka' lahko vsebuje samo števila.");
            }
        if (!verifyTextField(cityTextField)){
            statusBar.setForeground(Color.red);
            statusBar.setText("Polje 'Kraj' mora biti izpolnjeno.");
            isValid = false;
        }
        if (!verifyTextField(brandTextField)){
            statusBar.setForeground(Color.red);
            statusBar.setText("Polje 'Znamka' mora biti izpolnjeno.");
            isValid = false;
        }
        if (!verifyTextField(modelTextField)){
            statusBar.setForeground(Color.red);
            statusBar.setText("Polje 'Model' mora biti izpolnjeno.");
            isValid = false;
        }
        if (!verifyTextField(registrionNumberTextField)){
            statusBar.setForeground(Color.red);
            statusBar.setText("Polje 'Registracijska oznaka' mora biti izpolnjeno.");
            isValid = false;
        }
        return isValid;
    }
    
    private void saveDocument(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveDocument
        boolean isValid = validateForm();        
        
        if (isValid){
            fileChooser.setSelectedFile(new File(nameTextField.getText() + "-" + surenameTextField.getText() + ".xml"));
            if (fileChooser.showSaveDialog(this) == JFileChooser.APPROVE_OPTION){
                File file = fileChooser.getSelectedFile();

                if (file.exists()){
                    statusBar.setText("Dokument z enakim imenom že obstaja!");
                    return;
                }

                statusBar.setText("Datoteka je izbrana");
                try {
                    try {
                        Insuree insuree = new Insuree();
                        insuree.name = nameTextField.getText();
                        insuree.surname = surenameTextField.getText();
                        insuree.birthday = (Date) birthdateDatePicker.getValue();
                        insuree.address = addressTextField.getText();
                        insuree.postNumber = postNumberTextField.getText();
                        insuree.city = cityTextField.getText();
                        insuree.youngDriver = youngDriverCheckBox.isSelected();

                        Vehicle vehicle = new Vehicle();
                        vehicle.brand = brandTextField.getText();
                        vehicle.model = modelTextField.getText();
                        vehicle.transmission = transmissionComboBox.getSelectedItem().toString();
                        vehicle.volume = volumeSpinner.getValue().toString();
                        vehicle.power = powerSpinner.getValue().toString();
                        vehicle.fuel = fuelTypeComboBox.getSelectedItem().toString();
                        vehicle.type = vehicleTypeComboBox.getSelectedItem().toString();
                        vehicle.doors = doorsComboBox.getSelectedItem().toString();
                        vehicle.seats = seatsComboBox.getSelectedItem().toString();
                        vehicle.firstRegistration = (Date) firstRegistrationDatePicker.getValue();
                        vehicle.registraionNumber = registrionNumberTextField.getText();

                        Insurance insurance = new Insurance();
                        //osnovno zavarovanje
                        insurance.ao = AORadioButton.isSelected();
                        insurance.aoPlus = AOPlusRadioButton.isSelected();
                        //kasko
                        insurance.noKasko = noKaskoRadioButton.isSelected();
                        insurance.fullKasko = fullKaskoRadioButton.isSelected();
                        insurance.deductableKasko = deductableKaskoRadioButton.isSelected();
                        //dodatno zavarovanje
                        insurance.zavarovanjeStekel = steklaCheckBox.isSelected();
                        insurance.zavarovanjeParkirisce = parkingCheckBox.isSelected();
                        insurance.zavarovajeProtiKraji = protiKrajiCheckBox.isSelected();
                        insurance.zavarovanjeTretjeOsebe = tretjaOsebaCheckBox1.isSelected();
                        insurance.zavarovanjePnevmatik = gumeCheckBox.isSelected();
                        insurance.zavarovanjePotnikov = potnikiCheckBox.isSelected();
                        insurance.zavarovanjeProtiToci = tocaCheckBox.isSelected();

                        InsuranceDocument document = new InsuranceDocument(insuree, vehicle, insurance);

                        JAXBContext contextObj = JAXBContext.newInstance(InsuranceDocument.class);
                        Marshaller marshallerObj = contextObj.createMarshaller();  
                        marshallerObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true); 

                        marshallerObj.marshal(document, new FileOutputStream(file.getPath()));  
                    } catch (JAXBException ex) {
                        statusBar.setForeground(Color.red);
                        statusBar.setText("Prišlo je do napake pri pretvorbi podatkov. Prosimo, preglejte podatke in poizkusite znova.");
                    } catch (FileNotFoundException ex) {
                        statusBar.setForeground(Color.red);
                        statusBar.setText("Dokumenta ni bilo mogoče najti.");
                    }

                    statusBar.setForeground(Color.green);
                    statusBar.setText("Datoteka je bila uspešno shranjena.");
                } catch (Exception ex) {
                    statusBar.setForeground(Color.red);
                    statusBar.setText("Prišlo je do napake pri shranjevanju datoteke: " + file.getName());
                }
            }
        } 
        else {
            JOptionPane.showMessageDialog(this, "Nekatera polja nimajo veljavne vrednosti (rdeče obarvana polja).\nProsimo, da jih popravite in poizkusite znova.", "Opozorilo", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_saveDocument

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        saveDocument(evt);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        int dialogResult = JOptionPane.showConfirmDialog (null, "Ali želite shraniti podatke pred zaprtjem programa?","Opozorilo", JOptionPane.YES_NO_OPTION);
        if(dialogResult == JOptionPane.YES_OPTION){
            saveDocument(evt);
            Timer timer = new Timer(2000, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg0) {            
                    System.exit(0);
                }
            });
            timer.setRepeats(false);
            timer.start();           
        }
        else {
            System.exit(0);
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        validateForm();
    }//GEN-LAST:event_jMenuItem5ActionPerformed
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new MainFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton AOPlusRadioButton;
    private javax.swing.JRadioButton AORadioButton;
    private javax.swing.JLabel additionalInsuranceLabel;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JTextField addressTextField;
    private javax.swing.JSpinner birthdateDatePicker;
    private javax.swing.JPanel bottomPanel;
    private javax.swing.JLabel brandLabel;
    private javax.swing.JTextField brandTextField;
    private javax.swing.JLabel cityLabel;
    private javax.swing.JTextField cityTextField;
    private javax.swing.JButton clearButton;
    private javax.swing.JLabel dayLabel;
    private javax.swing.JRadioButton deductableKaskoRadioButton;
    private javax.swing.ButtonGroup defaultInsuranceButtonGroup;
    private javax.swing.JLabel defaultInsuranceLabelLabel;
    private javax.swing.JComboBox<String> doorsComboBox;
    private javax.swing.JLabel doorsLabel;
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JLabel firstRegistraionLabel;
    private javax.swing.JSpinner firstRegistrationDatePicker;
    private javax.swing.JComboBox<String> fuelTypeComboBox;
    private javax.swing.JLabel fuelTypeLabel;
    private javax.swing.JRadioButton fullKaskoRadioButton;
    private javax.swing.JPanel gridLayout;
    private javax.swing.JCheckBox gumeCheckBox;
    private javax.swing.JPanel insurancePanel;
    private javax.swing.JPanel insureePanel;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.ButtonGroup kaskoButtonGroup;
    private javax.swing.JLabel kaskoLabel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel modelLabel;
    private javax.swing.JTextField modelTextField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JRadioButton noKaskoRadioButton;
    private javax.swing.JCheckBox parkingCheckBox;
    private javax.swing.JLabel postNumberLabel;
    private javax.swing.JTextField postNumberTextField;
    private javax.swing.JCheckBox potnikiCheckBox;
    private javax.swing.JLabel powerLabel;
    private javax.swing.JSpinner powerSpinner;
    private javax.swing.JCheckBox protiKrajiCheckBox;
    private javax.swing.JLabel registrationNumberLabel;
    private javax.swing.JTextField registrionNumberTextField;
    private javax.swing.JButton saveButton;
    private javax.swing.JComboBox<String> seatsComboBox;
    private javax.swing.JLabel seatsLabel;
    private javax.swing.JLabel statusBar;
    private javax.swing.JCheckBox steklaCheckBox;
    private javax.swing.JLabel surenameLabel;
    private javax.swing.JTextField surenameTextField;
    private javax.swing.JCheckBox tocaCheckBox;
    private javax.swing.JComboBox<String> transmissionComboBox;
    private javax.swing.JLabel transmissionLabel;
    private javax.swing.JCheckBox tretjaOsebaCheckBox1;
    private javax.swing.JPanel vehiclePanel;
    private javax.swing.JComboBox<String> vehicleTypeComboBox;
    private javax.swing.JLabel vehicleTypeLabel;
    private javax.swing.JLabel volumeLabel;
    private javax.swing.JSpinner volumeSpinner;
    private javax.swing.JCheckBox youngDriverCheckBox;
    // End of variables declaration//GEN-END:variables
}
