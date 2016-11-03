/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xyz.app;

/**
 * GUI builder created Form
 *
 * @author jitendrasingh
 */
public class GuiComponent extends com.codename1.ui.Form {

    public GuiComponent() {
        this(com.codename1.ui.util.Resources.getGlobalResources());
    }
    
    public GuiComponent(com.codename1.ui.util.Resources resourceObjectInstance) {
        initGuiBuilderComponents(resourceObjectInstance);
    }

//-- DON'T EDIT BELOW THIS LINE!!!
    private com.codename1.ui.Label gui_Label_1 = new com.codename1.ui.Label();
    private com.codename1.ui.TextField gui_UserName = new com.codename1.ui.TextField();
    private com.codename1.ui.Label gui_Email = new com.codename1.ui.Label();
    private com.codename1.ui.TextField gui_email = new com.codename1.ui.TextField();
    private com.codename1.ui.Container gui_Container_1 = new com.codename1.ui.Container(new com.codename1.ui.layouts.FlowLayout());
    private com.codename1.ui.Button gui_Button_1 = new com.codename1.ui.Button();


// <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void guiBuilderBindComponentListeners() {
        EventCallbackClass callback = new EventCallbackClass();
        gui_UserName.addActionListener(callback);
        gui_Button_1.addActionListener(callback);
    }

    class EventCallbackClass implements com.codename1.ui.events.ActionListener, com.codename1.ui.events.DataChangedListener {
        private com.codename1.ui.Component cmp;
        public EventCallbackClass(com.codename1.ui.Component cmp) {
            this.cmp = cmp;
        }

        public EventCallbackClass() {
        }

        public void actionPerformed(com.codename1.ui.events.ActionEvent ev) {
            com.codename1.ui.Component sourceComponent = ev.getComponent();
            if(sourceComponent.getParent().getLeadParent() != null) {
                sourceComponent = sourceComponent.getParent().getLeadParent();
            }

            if(sourceComponent == gui_UserName) {
                onUserNameActionEvent(ev);
            }
            if(sourceComponent == gui_Button_1) {
                onButton_1ActionEvent(ev);
            }
        }

        public void dataChanged(int type, int index) {
        }
    }
    private void initGuiBuilderComponents(com.codename1.ui.util.Resources resourceObjectInstance) {
        guiBuilderBindComponentListeners();
        setLayout(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.Y_AXIS));
        setTitle("GuiComponent");
        setName("GuiComponent");
        addComponent(gui_Label_1);
        addComponent(gui_UserName);
        addComponent(gui_Email);
        addComponent(gui_email);
        addComponent(gui_Container_1);
        gui_Container_1.setName("Container_1");
        gui_Container_1.addComponent(gui_Button_1);
        gui_Button_1.setText("Login");
        gui_Button_1.setName("Button_1");
        gui_Label_1.setText("UserName");
        gui_Label_1.setName("Label_1");
        gui_UserName.setHint("UserName");
        gui_UserName.setText("");
        gui_UserName.setName("UserName");
        gui_Email.setText("Email");
        gui_Email.setName("Email");
        gui_email.setHint("Email Address");
        gui_email.setText("");
        gui_email.setName("email");
        gui_Container_1.setName("Container_1");
    }// </editor-fold>

//-- DON'T EDIT ABOVE THIS LINE!!!
    public void onUserNameActionEvent(com.codename1.ui.events.ActionEvent ev) {
    }

    public void onButton_1ActionEvent(com.codename1.ui.events.ActionEvent ev) {
    }

}
