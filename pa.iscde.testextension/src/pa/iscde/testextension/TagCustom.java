package pa.iscde.testextension;

import pa.iscde.javadoc.export.parser.JavaDocCustomTagI;
import pa.iscde.javadoc.export.style.AnnotationStyleI;
import pa.iscde.javadoc.export.style.StyleToolBox;
import pt.iscde.javadoc.annotations.mfane.JavaDocCustomAnnotationExtension;

public class TagCustom implements JavaDocCustomAnnotationExtension {

    @Override
    public JavaDocCustomTagI getJavaDocCustomTag() {
	return new JavaDocCustomTagI() {

	    @Override
	    public String getTagName() {
		return "custom";
	    }

	    @Override
	    public String getHeaderName() {
		return "Custom Tag";
	    }

	    @Override
	    public int nColumns() {
		return 3;
	    }
	    
	    @Override
	    public String getColumnSeparator() {
		return " ";
	    }

	    @Override
	    public AnnotationStyleI[] getAnnotationStyle() {
		return new AnnotationStyleI[] { 
			StyleToolBox.BoldStyle(new int[] { 0, 2 }), 
			StyleToolBox.ItalicStyle(new int[] { 1, 2 }),
		};
	    }
	};
    }

}