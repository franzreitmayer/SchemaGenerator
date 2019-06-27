// $ANTLR 3.4 F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaOracleSQL.g 2013-06-09 23:03:27

package eu.reitmayer.schemagen.lang;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.stringtemplate.*;
import org.antlr.stringtemplate.language.*;
import java.util.HashMap;
@SuppressWarnings({"all", "warnings", "unchecked"})
public class SchemaOracleSQL extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "ATTR", "BETWEEN", "DOMAIN", "Digit", "ELEMENT", "ENTITY", "FROM", "ID", "INT", "KEY", "LENGTH", "LINK", "LTEXT", "Letter", "MANY", "ML", "MTEXT", "NL", "ONE", "PRECISION", "SCHEMA", "SEMI", "SET", "SL", "STEXT", "STRING", "TO", "TYPE", "TYPE_DATE", "TYPE_INT", "TYPE_NUMBER", "TYPE_STRING", "TYPE_TIMESTAMP", "WS", "'('", "')'", "','", "'='"
    };

    public static final int EOF=-1;
    public static final int T__39=39;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int AND=4;
    public static final int ATTR=5;
    public static final int BETWEEN=6;
    public static final int DOMAIN=7;
    public static final int Digit=8;
    public static final int ELEMENT=9;
    public static final int ENTITY=10;
    public static final int FROM=11;
    public static final int ID=12;
    public static final int INT=13;
    public static final int KEY=14;
    public static final int LENGTH=15;
    public static final int LINK=16;
    public static final int LTEXT=17;
    public static final int Letter=18;
    public static final int MANY=19;
    public static final int ML=20;
    public static final int MTEXT=21;
    public static final int NL=22;
    public static final int ONE=23;
    public static final int PRECISION=24;
    public static final int SCHEMA=25;
    public static final int SEMI=26;
    public static final int SET=27;
    public static final int SL=28;
    public static final int STEXT=29;
    public static final int STRING=30;
    public static final int TO=31;
    public static final int TYPE=32;
    public static final int TYPE_DATE=33;
    public static final int TYPE_INT=34;
    public static final int TYPE_NUMBER=35;
    public static final int TYPE_STRING=36;
    public static final int TYPE_TIMESTAMP=37;
    public static final int WS=38;

    // delegates
    public TreeParser[] getDelegates() {
        return new TreeParser[] {};
    }

    // delegators


    public SchemaOracleSQL(TreeNodeStream input) {
        this(input, new RecognizerSharedState());
    }
    public SchemaOracleSQL(TreeNodeStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected StringTemplateGroup templateLib =
  new StringTemplateGroup("SchemaOracleSQLTemplates", AngleBracketTemplateLexer.class);

public void setTemplateLib(StringTemplateGroup templateLib) {
  this.templateLib = templateLib;
}
public StringTemplateGroup getTemplateLib() {
  return templateLib;
}
/** allows convenient multi-value initialization:
 *  "new STAttrMap().put(...).put(...)"
 */
public static class STAttrMap extends HashMap {
  public STAttrMap put(String attrName, Object value) {
    super.put(attrName, value);
    return this;
  }
  public STAttrMap put(String attrName, int value) {
    super.put(attrName, new Integer(value));
    return this;
  }
}
    public String[] getTokenNames() { return SchemaOracleSQL.tokenNames; }
    public String getGrammarFileName() { return "F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaOracleSQL.g"; }


    public List<TableField> keyFields = new ArrayList<TableField>();

    public String getOracleType(String internalType) {
    	return SchemaOracleUtil.getOracleType(internalType);
    }

    public List<String> getKeyList(String tableName) {
    	return SchemaOracleUtil.getKeyList(tableName, keyFields);
    }

    public Schema schema = new Schema();


    public static class schema_file_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "schema_file"
    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaOracleSQL.g:28:1: schema_file : (d+= entity_def |d+= attr_def )* -> file(defs=$d);
    public final SchemaOracleSQL.schema_file_return schema_file() throws RecognitionException {
        SchemaOracleSQL.schema_file_return retval = new SchemaOracleSQL.schema_file_return();
        retval.start = input.LT(1);


        List list_d=null;
        RuleReturnScope d = null;
        try {
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaOracleSQL.g:28:12: ( (d+= entity_def |d+= attr_def )* -> file(defs=$d))
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaOracleSQL.g:29:2: (d+= entity_def |d+= attr_def )*
            {
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaOracleSQL.g:29:2: (d+= entity_def |d+= attr_def )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==ENTITY) ) {
                    alt1=1;
                }
                else if ( (LA1_0==ATTR) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaOracleSQL.g:29:3: d+= entity_def
            	    {
            	    pushFollow(FOLLOW_entity_def_in_schema_file68);
            	    d=entity_def();

            	    state._fsp--;

            	    if (list_d==null) list_d=new ArrayList();
            	    list_d.add(d.getTemplate());


            	    }
            	    break;
            	case 2 :
            	    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaOracleSQL.g:30:3: d+= attr_def
            	    {
            	    pushFollow(FOLLOW_attr_def_in_schema_file76);
            	    d=attr_def();

            	    state._fsp--;

            	    if (list_d==null) list_d=new ArrayList();
            	    list_d.add(d.getTemplate());


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            // TEMPLATE REWRITE
            // 30:17: -> file(defs=$d)
            {
                retval.st = templateLib.getInstanceOf("file",new STAttrMap().put("defs", list_d));
            }



            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "schema_file"


    public static class entity_def_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "entity_def"
    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaOracleSQL.g:35:1: entity_def : ^( ENTITY id= ID (ua+= use_attr )* ) -> table(name=$id.textcols=$uakeys=getKeyList($id.text));
    public final SchemaOracleSQL.entity_def_return entity_def() throws RecognitionException {
        SchemaOracleSQL.entity_def_return retval = new SchemaOracleSQL.entity_def_return();
        retval.start = input.LT(1);


        CommonTree id=null;
        List list_ua=null;
        RuleReturnScope ua = null;
        try {
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaOracleSQL.g:35:11: ( ^( ENTITY id= ID (ua+= use_attr )* ) -> table(name=$id.textcols=$uakeys=getKeyList($id.text)))
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaOracleSQL.g:36:2: ^( ENTITY id= ID (ua+= use_attr )* )
            {
            match(input,ENTITY,FOLLOW_ENTITY_in_entity_def104); 

            match(input, Token.DOWN, null); 
            id=(CommonTree)match(input,ID,FOLLOW_ID_in_entity_def108); 

            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaOracleSQL.g:37:5: (ua+= use_attr )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==ATTR) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaOracleSQL.g:37:5: ua+= use_attr
            	    {
            	    pushFollow(FOLLOW_use_attr_in_entity_def114);
            	    ua=use_attr();

            	    state._fsp--;

            	    if (list_ua==null) list_ua=new ArrayList();
            	    list_ua.add(ua.getTemplate());


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 38:3: -> table(name=$id.textcols=$uakeys=getKeyList($id.text))
            {
                retval.st = templateLib.getInstanceOf("table",new STAttrMap().put("name", (id!=null?id.getText():null)).put("cols", list_ua).put("keys", getKeyList((id!=null?id.getText():null))));
            }



            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "entity_def"


    public static class use_attr_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "use_attr"
    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaOracleSQL.g:42:1: use_attr : ad= attr_def -> {$ad.st};
    public final SchemaOracleSQL.use_attr_return use_attr() throws RecognitionException {
        SchemaOracleSQL.use_attr_return retval = new SchemaOracleSQL.use_attr_return();
        retval.start = input.LT(1);


        SchemaOracleSQL.attr_def_return ad =null;


        try {
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaOracleSQL.g:42:9: (ad= attr_def -> {$ad.st})
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaOracleSQL.g:43:2: ad= attr_def
            {
            pushFollow(FOLLOW_attr_def_in_use_attr150);
            ad=attr_def();

            state._fsp--;


            // TEMPLATE REWRITE
            // 43:14: -> {$ad.st}
            {
                retval.st = (ad!=null?ad.st:null);
            }



            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "use_attr"


    public static class attr_def_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "attr_def"
    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaOracleSQL.g:47:1: attr_def : ( ^( ATTR id= ID (t= TYPE_STRING |t= TYPE_INT |t= TYPE_NUMBER ) ) -> simple_column(name=$id.texttype=getOracleType($t.text))| ^( ATTR id= ID (t= TYPE_STRING |t= TYPE_INT |t= TYPE_NUMBER ) i= INT ) -> length_column(name=$id.texttype=getOracleType($t.text)len=$i.text)| ^( ATTR id= ID (t= TYPE_STRING |t= TYPE_INT |t= TYPE_NUMBER ) i= INT p= INT ) -> precision_column(name=$id.texttype=getOracleType($t.text)len=$i.textprecision=$p.text));
    public final SchemaOracleSQL.attr_def_return attr_def() throws RecognitionException {
        SchemaOracleSQL.attr_def_return retval = new SchemaOracleSQL.attr_def_return();
        retval.start = input.LT(1);


        CommonTree id=null;
        CommonTree t=null;
        CommonTree i=null;
        CommonTree p=null;

        try {
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaOracleSQL.g:47:9: ( ^( ATTR id= ID (t= TYPE_STRING |t= TYPE_INT |t= TYPE_NUMBER ) ) -> simple_column(name=$id.texttype=getOracleType($t.text))| ^( ATTR id= ID (t= TYPE_STRING |t= TYPE_INT |t= TYPE_NUMBER ) i= INT ) -> length_column(name=$id.texttype=getOracleType($t.text)len=$i.text)| ^( ATTR id= ID (t= TYPE_STRING |t= TYPE_INT |t= TYPE_NUMBER ) i= INT p= INT ) -> precision_column(name=$id.texttype=getOracleType($t.text)len=$i.textprecision=$p.text))
            int alt6=3;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==ATTR) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==DOWN) ) {
                    int LA6_2 = input.LA(3);

                    if ( (LA6_2==ID) ) {
                        switch ( input.LA(4) ) {
                        case TYPE_STRING:
                            {
                            int LA6_4 = input.LA(5);

                            if ( (LA6_4==UP) ) {
                                alt6=1;
                            }
                            else if ( (LA6_4==INT) ) {
                                int LA6_8 = input.LA(6);

                                if ( (LA6_8==UP) ) {
                                    alt6=2;
                                }
                                else if ( (LA6_8==INT) ) {
                                    alt6=3;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 6, 8, input);

                                    throw nvae;

                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 6, 4, input);

                                throw nvae;

                            }
                            }
                            break;
                        case TYPE_INT:
                            {
                            int LA6_5 = input.LA(5);

                            if ( (LA6_5==UP) ) {
                                alt6=1;
                            }
                            else if ( (LA6_5==INT) ) {
                                int LA6_8 = input.LA(6);

                                if ( (LA6_8==UP) ) {
                                    alt6=2;
                                }
                                else if ( (LA6_8==INT) ) {
                                    alt6=3;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 6, 8, input);

                                    throw nvae;

                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 6, 5, input);

                                throw nvae;

                            }
                            }
                            break;
                        case TYPE_NUMBER:
                            {
                            int LA6_6 = input.LA(5);

                            if ( (LA6_6==UP) ) {
                                alt6=1;
                            }
                            else if ( (LA6_6==INT) ) {
                                int LA6_8 = input.LA(6);

                                if ( (LA6_8==UP) ) {
                                    alt6=2;
                                }
                                else if ( (LA6_8==INT) ) {
                                    alt6=3;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 6, 8, input);

                                    throw nvae;

                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 6, 6, input);

                                throw nvae;

                            }
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 6, 3, input);

                            throw nvae;

                        }

                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 2, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }
            switch (alt6) {
                case 1 :
                    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaOracleSQL.g:48:2: ^( ATTR id= ID (t= TYPE_STRING |t= TYPE_INT |t= TYPE_NUMBER ) )
                    {
                    match(input,ATTR,FOLLOW_ATTR_in_attr_def166); 

                    match(input, Token.DOWN, null); 
                    id=(CommonTree)match(input,ID,FOLLOW_ID_in_attr_def170); 

                    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaOracleSQL.g:48:15: (t= TYPE_STRING |t= TYPE_INT |t= TYPE_NUMBER )
                    int alt3=3;
                    switch ( input.LA(1) ) {
                    case TYPE_STRING:
                        {
                        alt3=1;
                        }
                        break;
                    case TYPE_INT:
                        {
                        alt3=2;
                        }
                        break;
                    case TYPE_NUMBER:
                        {
                        alt3=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 0, input);

                        throw nvae;

                    }

                    switch (alt3) {
                        case 1 :
                            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaOracleSQL.g:48:16: t= TYPE_STRING
                            {
                            t=(CommonTree)match(input,TYPE_STRING,FOLLOW_TYPE_STRING_in_attr_def175); 

                            }
                            break;
                        case 2 :
                            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaOracleSQL.g:48:32: t= TYPE_INT
                            {
                            t=(CommonTree)match(input,TYPE_INT,FOLLOW_TYPE_INT_in_attr_def181); 

                            }
                            break;
                        case 3 :
                            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaOracleSQL.g:48:45: t= TYPE_NUMBER
                            {
                            t=(CommonTree)match(input,TYPE_NUMBER,FOLLOW_TYPE_NUMBER_in_attr_def187); 

                            }
                            break;

                    }


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 49:3: -> simple_column(name=$id.texttype=getOracleType($t.text))
                    {
                        retval.st = templateLib.getInstanceOf("simple_column",new STAttrMap().put("name", (id!=null?id.getText():null)).put("type", getOracleType((t!=null?t.getText():null))));
                    }



                    }
                    break;
                case 2 :
                    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaOracleSQL.g:50:2: ^( ATTR id= ID (t= TYPE_STRING |t= TYPE_INT |t= TYPE_NUMBER ) i= INT )
                    {
                    match(input,ATTR,FOLLOW_ATTR_in_attr_def211); 

                    match(input, Token.DOWN, null); 
                    id=(CommonTree)match(input,ID,FOLLOW_ID_in_attr_def215); 

                    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaOracleSQL.g:50:15: (t= TYPE_STRING |t= TYPE_INT |t= TYPE_NUMBER )
                    int alt4=3;
                    switch ( input.LA(1) ) {
                    case TYPE_STRING:
                        {
                        alt4=1;
                        }
                        break;
                    case TYPE_INT:
                        {
                        alt4=2;
                        }
                        break;
                    case TYPE_NUMBER:
                        {
                        alt4=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 0, input);

                        throw nvae;

                    }

                    switch (alt4) {
                        case 1 :
                            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaOracleSQL.g:50:16: t= TYPE_STRING
                            {
                            t=(CommonTree)match(input,TYPE_STRING,FOLLOW_TYPE_STRING_in_attr_def220); 

                            }
                            break;
                        case 2 :
                            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaOracleSQL.g:50:32: t= TYPE_INT
                            {
                            t=(CommonTree)match(input,TYPE_INT,FOLLOW_TYPE_INT_in_attr_def226); 

                            }
                            break;
                        case 3 :
                            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaOracleSQL.g:50:45: t= TYPE_NUMBER
                            {
                            t=(CommonTree)match(input,TYPE_NUMBER,FOLLOW_TYPE_NUMBER_in_attr_def232); 

                            }
                            break;

                    }


                    i=(CommonTree)match(input,INT,FOLLOW_INT_in_attr_def237); 

                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 51:3: -> length_column(name=$id.texttype=getOracleType($t.text)len=$i.text)
                    {
                        retval.st = templateLib.getInstanceOf("length_column",new STAttrMap().put("name", (id!=null?id.getText():null)).put("type", getOracleType((t!=null?t.getText():null))).put("len", (i!=null?i.getText():null)));
                    }



                    }
                    break;
                case 3 :
                    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaOracleSQL.g:52:2: ^( ATTR id= ID (t= TYPE_STRING |t= TYPE_INT |t= TYPE_NUMBER ) i= INT p= INT )
                    {
                    match(input,ATTR,FOLLOW_ATTR_in_attr_def265); 

                    match(input, Token.DOWN, null); 
                    id=(CommonTree)match(input,ID,FOLLOW_ID_in_attr_def269); 

                    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaOracleSQL.g:52:15: (t= TYPE_STRING |t= TYPE_INT |t= TYPE_NUMBER )
                    int alt5=3;
                    switch ( input.LA(1) ) {
                    case TYPE_STRING:
                        {
                        alt5=1;
                        }
                        break;
                    case TYPE_INT:
                        {
                        alt5=2;
                        }
                        break;
                    case TYPE_NUMBER:
                        {
                        alt5=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 0, input);

                        throw nvae;

                    }

                    switch (alt5) {
                        case 1 :
                            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaOracleSQL.g:52:16: t= TYPE_STRING
                            {
                            t=(CommonTree)match(input,TYPE_STRING,FOLLOW_TYPE_STRING_in_attr_def274); 

                            }
                            break;
                        case 2 :
                            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaOracleSQL.g:52:32: t= TYPE_INT
                            {
                            t=(CommonTree)match(input,TYPE_INT,FOLLOW_TYPE_INT_in_attr_def280); 

                            }
                            break;
                        case 3 :
                            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaOracleSQL.g:52:45: t= TYPE_NUMBER
                            {
                            t=(CommonTree)match(input,TYPE_NUMBER,FOLLOW_TYPE_NUMBER_in_attr_def286); 

                            }
                            break;

                    }


                    i=(CommonTree)match(input,INT,FOLLOW_INT_in_attr_def291); 

                    p=(CommonTree)match(input,INT,FOLLOW_INT_in_attr_def295); 

                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 53:3: -> precision_column(name=$id.texttype=getOracleType($t.text)len=$i.textprecision=$p.text)
                    {
                        retval.st = templateLib.getInstanceOf("precision_column",new STAttrMap().put("name", (id!=null?id.getText():null)).put("type", getOracleType((t!=null?t.getText():null))).put("len", (i!=null?i.getText():null)).put("precision", (p!=null?p.getText():null)));
                    }



                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "attr_def"

    // Delegated rules


 

    public static final BitSet FOLLOW_entity_def_in_schema_file68 = new BitSet(new long[]{0x0000000000000422L});
    public static final BitSet FOLLOW_attr_def_in_schema_file76 = new BitSet(new long[]{0x0000000000000422L});
    public static final BitSet FOLLOW_ENTITY_in_entity_def104 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_entity_def108 = new BitSet(new long[]{0x0000000000000028L});
    public static final BitSet FOLLOW_use_attr_in_entity_def114 = new BitSet(new long[]{0x0000000000000028L});
    public static final BitSet FOLLOW_attr_def_in_use_attr150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ATTR_in_attr_def166 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_attr_def170 = new BitSet(new long[]{0x0000001C00000000L});
    public static final BitSet FOLLOW_TYPE_STRING_in_attr_def175 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TYPE_INT_in_attr_def181 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TYPE_NUMBER_in_attr_def187 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ATTR_in_attr_def211 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_attr_def215 = new BitSet(new long[]{0x0000001C00000000L});
    public static final BitSet FOLLOW_TYPE_STRING_in_attr_def220 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_TYPE_INT_in_attr_def226 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_TYPE_NUMBER_in_attr_def232 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_INT_in_attr_def237 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ATTR_in_attr_def265 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_attr_def269 = new BitSet(new long[]{0x0000001C00000000L});
    public static final BitSet FOLLOW_TYPE_STRING_in_attr_def274 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_TYPE_INT_in_attr_def280 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_TYPE_NUMBER_in_attr_def286 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_INT_in_attr_def291 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_INT_in_attr_def295 = new BitSet(new long[]{0x0000000000000008L});

}