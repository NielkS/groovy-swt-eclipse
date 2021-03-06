/*
 * Created on Feb 20, 2004
 *
 */
package groovy.jface.impl;

import groovy.lang.Closure;
import groovy.swt.ClosureSupport;

import org.eclipse.jface.wizard.IWizard;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;

/**
 * Provide a public method getWizard and provide access to parentShell
 * 
 * @author <a href="mailto:ckl@dacelo.nl">Christiaan ten Klooster </a>
 * @version $Revision: 915 $
 */
public class WizardDialogImpl extends WizardDialog implements ClosureSupport {
    private Closure closure;
    private Shell parentShell;

    public WizardDialogImpl(Shell parentShell, IWizard newWizard) {
        super(parentShell, newWizard);
        this.parentShell = parentShell;
        /*********** TODO: Do we really want to do this
        Display display = Display.getDefault( );
                   
        // add a global listener for key down events
        // call cancelPressed if esc key is hit
        display.addFilter(SWT.KeyDown, new Listener() {
            public void handleEvent(Event event) {
            	if (event.keyCode == SWT.ESC) {
            		cancelPressed();
            	}
            }
        }); 

         */
        
        
    }

    public IWizard getWizard() {
        return super.getWizard();
    }

    public Shell getParentShell() {
        return parentShell;
    }

    /*
     * @see groovy.swt.ClosureSupport#getClosure()
     */
    public Closure getClosure() {
        return closure;
    }

    /*
     * @see groovy.swt.ClosureSupport#setClosure(groovy.lang.Closure)
     */
    public void setClosure(Closure closure) {
        this.closure = closure;
    }

    /********* TODO: Do we really want to do this?
    protected void buttonPressed(int buttonId) {
    	switch (buttonId) {
        case IDialogConstants.HELP_ID: {
            helpPressed();
            break;
        }
        case IDialogConstants.BACK_ID: {
        	((WizardPageImpl)this.getCurrentPage()).backPressed();
            backPressed();
            break;
        }
        case IDialogConstants.NEXT_ID: {
        	((WizardPageImpl)this.getCurrentPage()).nextPressed();
            nextPressed();
            break;
        }
        case IDialogConstants.FINISH_ID: {
            finishPressed();
            break;
        }
        // The Cancel button has a listener which calls cancelPressed directly
    	}
    	*/


}
