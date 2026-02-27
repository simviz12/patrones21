package com.taller.gui.app;

import com.taller.gui.factories.GUIFactory;
import com.taller.gui.products.*;

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void render() {
        button.paint();
        checkbox.paint();
    }
}
