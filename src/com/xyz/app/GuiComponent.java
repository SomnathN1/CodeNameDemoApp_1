/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xyz.app;

import com.codename1.capture.Capture;
import com.codename1.io.Log;
import com.codename1.ui.Dialog;
import com.codename1.ui.Display;
import com.codename1.ui.FontImage;
import com.codename1.ui.Form;
import com.codename1.ui.Graphics;
import com.codename1.ui.Image;
import com.codename1.ui.Label;
import com.codename1.ui.Toolbar;
import com.codename1.ui.layouts.BorderLayout;
import com.codename1.ui.plaf.Style;
import com.codename1.ui.plaf.UIManager;
import java.io.IOException;

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
    private com.codename1.ui.Label gui_latitude = new com.codename1.ui.Label();
    private com.codename1.ui.TextField gui_edit_latitude = new com.codename1.ui.TextField();
    private com.codename1.ui.Label gui_label_longitude = new com.codename1.ui.Label();
    private com.codename1.ui.TextField gui_edit_longitude = new com.codename1.ui.TextField();
    private com.codename1.ui.Button gui_bttn_capture_pic = new com.codename1.ui.Button();
    private com.codename1.components.SpanButton gui_Add = new com.codename1.components.SpanButton();


// <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void guiBuilderBindComponentListeners() {
        EventCallbackClass callback = new EventCallbackClass();
        gui_UserName.addActionListener(callback);
        gui_bttn_capture_pic.addActionListener(callback);
        gui_Add.addActionListener(callback);
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
            if(sourceComponent == gui_bttn_capture_pic) {
                onbttn_capture_picActionEvent(ev);
            }
            if(sourceComponent == gui_Add) {
                onAddActionEvent(ev);
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
        addComponent(gui_latitude);
        addComponent(gui_edit_latitude);
        addComponent(gui_label_longitude);
        addComponent(gui_edit_longitude);
        addComponent(gui_bttn_capture_pic);
        addComponent(gui_Add);
        gui_Label_1.setText("UserName");
        gui_Label_1.setName("Label_1");
        gui_UserName.setHint("UserName");
        gui_UserName.setName("UserName");
        gui_Email.setText("Email");
        gui_Email.setName("Email");
        gui_email.setHint("Email Address");
        gui_email.setName("email");
        gui_latitude.setText("Latitude");
        gui_latitude.setUIID("latitude");
        gui_latitude.setName("latitude");
        gui_edit_latitude.setHint("Latitude");
        gui_edit_latitude.setName("edit_latitude");
        gui_label_longitude.setText("Longitude");
        gui_label_longitude.setName("label_longitude");
        gui_edit_longitude.setHint("Longitude");
        gui_edit_longitude.setName("edit_longitude");
        gui_bttn_capture_pic.setText("Capture Picture");
        gui_bttn_capture_pic.setName("bttn_capture_pic");
        gui_Add.setText("Add Person");
        gui_Add.setName("Add");
    }// </editor-fold>

//-- DON'T EDIT ABOVE THIS LINE!!!
    public void onUserNameActionEvent(com.codename1.ui.events.ActionEvent ev) {
    }

    public void onButton_1ActionEvent(com.codename1.ui.events.ActionEvent ev) {
    }

    public void onbttn_capture_picActionEvent(com.codename1.ui.events.ActionEvent ev) 
    {
        //Dialog.show("capture", "capture", "Ok", "Cancel");
        capturePic();
    }

    public void onAddActionEvent(com.codename1.ui.events.ActionEvent ev) 
    {
        
    }
    
    public void capturePic()
    {
        Toolbar.setGlobalToolbar(true);
Form hi = new Form("Rounder", new BorderLayout());
Label picture = new Label("", "Container");
hi.add(BorderLayout.CENTER, picture);
hi.getUnselectedStyle().setBgColor(0xff0000);
hi.getUnselectedStyle().setBgTransparency(255);
Style s = UIManager.getInstance().getComponentStyle("TitleCommand");
Image camera = FontImage.createMaterial(FontImage.MATERIAL_CAMERA, s);
hi.getToolbar().addCommandToRightBar("", camera, (ev) -> {
    try {
        int width = Display.getInstance().getDisplayWidth();
        Image capturedImage = Image.createImage(Capture.capturePhoto(width, -1));
        Image roundMask = Image.createImage(width, capturedImage.getHeight(), 0xff000000);
        Graphics gr = roundMask.getGraphics();
        gr.setColor(0xffffff);
        gr.fillArc(0, 0, width, width, 0, 360);
        Object mask = roundMask.createMask();
        capturedImage = capturedImage.applyMask(mask);
        picture.setIcon(capturedImage);
        hi.revalidate();
    } catch(IOException err) {
        Log.e(err);
    }
});

hi.show();

    }


}
