package pa.iscde.testextension;

import org.eclipse.jdt.core.dom.MethodDeclaration;

import pa.iscde.javadoc.export.render.JavaDocMethodRender;

public class JavaDocNamedMethodRenderPostVisit implements JavaDocMethodRender {

    @Override
    public boolean render(MethodDeclaration method, StringBuilder sb) {
	sb.append("<br>");
	sb.append("<hr>");
	sb.append("Extension:").append(this.getClass().getSimpleName()).append("<br>");
	sb.append("MethodName:").append(method.getName().getFullyQualifiedName() ).append("<br>");
	sb.append("<hr>");
	sb.append("<br>");
	return false;
    }

}
