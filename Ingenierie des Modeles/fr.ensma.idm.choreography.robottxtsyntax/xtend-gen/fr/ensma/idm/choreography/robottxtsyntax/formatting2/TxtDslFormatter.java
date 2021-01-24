/**
 * generated by Xtext 2.23.0
 */
package fr.ensma.idm.choreography.robottxtsyntax.formatting2;

import com.google.inject.Inject;
import fr.ensma.idm.choreography.robottxtsyntax.services.TxtDslGrammarAccess;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;
import robotnxt.Choreography;
import robotnxt.Instruction;

@SuppressWarnings("all")
public class TxtDslFormatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private TxtDslGrammarAccess _txtDslGrammarAccess;
  
  protected void _format(final Choreography choreography, @Extension final IFormattableDocument document) {
    EList<Instruction> _instructions = choreography.getInstructions();
    for (final Instruction instruction : _instructions) {
      document.<Instruction>format(instruction);
    }
  }
  
  public void format(final Object choreography, final IFormattableDocument document) {
    if (choreography instanceof XtextResource) {
      _format((XtextResource)choreography, document);
      return;
    } else if (choreography instanceof Choreography) {
      _format((Choreography)choreography, document);
      return;
    } else if (choreography instanceof EObject) {
      _format((EObject)choreography, document);
      return;
    } else if (choreography == null) {
      _format((Void)null, document);
      return;
    } else if (choreography != null) {
      _format(choreography, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(choreography, document).toString());
    }
  }
}
