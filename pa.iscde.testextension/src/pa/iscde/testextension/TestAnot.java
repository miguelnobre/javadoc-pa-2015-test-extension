package pa.iscde.testextension;

import pa.iscde.javadoc.export.parser.JavaDocNamedTagI;
import pt.iscde.javadoc.annotations.mfane.JavaDocNamedAnnotationsExtension;

public class TestAnot implements JavaDocNamedAnnotationsExtension {

    @Override
    public JavaDocNamedTagI getTag() {
	return new JavaDocNamedTagI() {

	    @Override
	    public String getTagName() {
		return "name";
	    }

	    @Override
	    public String getHeaderName() {
		return "Names";
	    }
	};
    }
}