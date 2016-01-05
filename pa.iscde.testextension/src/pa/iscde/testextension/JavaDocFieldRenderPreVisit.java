package pa.iscde.testextension;

import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.VariableDeclarationFragment;

import pa.iscde.javadoc.export.render.JavaDocFieldRender;

public class JavaDocFieldRenderPreVisit implements JavaDocFieldRender {

    @Override
    public boolean render(FieldDeclaration field, StringBuilder sb) {
	sb.append("<br>");
	sb.append("<hr>");
	sb.append("Extension:").append(this.getClass().getSimpleName()).append("<br>");
	sb.append("FieldName:").append( ((VariableDeclarationFragment)field.fragments().get(0)).getName().getFullyQualifiedName()).append("<br>");
	sb.append("<hr>");
	sb.append("<br>");
	return false;
    }

}
