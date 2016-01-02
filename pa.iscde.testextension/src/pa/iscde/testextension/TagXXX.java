package pa.iscde.testextension;

import pa.iscde.javadoc.export.parser.JavaDocUnnamedTagI;
import pt.iscde.javadoc.annotations.mfane.JavaDocUnnamedAnnotationsExtension;

public class TagXXX implements JavaDocUnnamedAnnotationsExtension {

    @Override
    public JavaDocUnnamedTagI getTag() {
	return new JavaDocUnnamedTagI() {

	    @Override
	    public String getTagName() {
		return "xxx";
	    }

	    @Override
	    public String getHeaderName() {
		return "XXX";
	    }
	};
    }
}