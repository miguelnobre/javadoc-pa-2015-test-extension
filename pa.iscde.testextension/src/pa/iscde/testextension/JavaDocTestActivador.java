package pa.iscde.testextension;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import pa.iscde.javadoc.service.JavaDocServices;
import pt.iscte.pidesco.javaeditor.service.JavaEditorServices;

public class JavaDocTestActivador implements BundleActivator {

    private static JavaDocServices javaDocServices;
    private static JavaEditorServices javaEditorServices;

    @Override
    public void start(final BundleContext context) throws Exception {
	javaDocServices = (JavaDocServices) context.getService(context.getServiceReference(JavaDocServices.class));
	javaEditorServices = (JavaEditorServices) context.getService(context.getServiceReference(JavaEditorServices.class));
    }

    @Override
    public void stop(BundleContext context) throws Exception {
	javaDocServices = null;
    }

    public static JavaDocServices getJavaDocServices() {
	return javaDocServices;
    }

    public static JavaEditorServices getJavaEditorServices() {
	return javaEditorServices;
    }

}
