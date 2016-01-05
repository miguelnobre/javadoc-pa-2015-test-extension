package pa.iscde.testextension;

import org.eclipse.jdt.core.dom.MethodDeclaration;

import pa.iscde.javadoc.export.render.JavaDocMethodRender;

public class JavaDocMethodRenderPreVisit implements JavaDocMethodRender {

    @Override
    public boolean render(MethodDeclaration method, StringBuilder sb) {
	sb.append("<hr>").append('\n');
	sb.append("Extension:").append(this.getClass().getSimpleName()).append('\n');
	sb.append("MethodName:").append(method.getName().getFullyQualifiedName() ).append('\n');
	sb.append("<hr>").append('\n');
	return false;
    }

}
