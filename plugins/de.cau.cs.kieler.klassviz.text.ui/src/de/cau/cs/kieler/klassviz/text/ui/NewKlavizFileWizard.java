package de.cau.cs.kieler.klassviz.text.ui;

import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;
import org.eclipse.ui.wizards.newresource.BasicNewFileResourceWizard;

public class NewKlavizFileWizard extends BasicNewFileResourceWizard {

    /**
     * {@inheritDoc}
     */
    @Override
    public void addPage(final IWizardPage page) {
        if (page instanceof WizardNewFileCreationPage) {
            ((WizardNewFileCreationPage) page).setFileName("classes.klaviz");
        }
        super.addPage(page);
    }
}
