// $ANTLR 3.4 F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\EJBWalker.g 2013-06-09 23:03:32

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
public class EJBWalker extends TreeParser {
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


    public EJBWalker(TreeNodeStream input) {
        this(input, new RecognizerSharedState());
    }
    public EJBWalker(TreeNodeStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected StringTemplateGroup templateLib =
  new StringTemplateGroup("EJBWalkerTemplates", AngleBracketTemplateLexer.class);

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
    public String[] getTokenNames() { return EJBWalker.tokenNames; }
    public String getGrammarFileName() { return "F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\EJBWalker.g"; }


    	public Schema schema = new Schema();


    public static class schema_file_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "schema_file"
    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\EJBWalker.g:17:1: schema_file : ^( SCHEMA ID ( set_property )* ( schema_def )* ) ;
    public final EJBWalker.schema_file_return schema_file() throws RecognitionException {
        EJBWalker.schema_file_return retval = new EJBWalker.schema_file_return();
        retval.start = input.LT(1);


        CommonTree ID1=null;

        try {
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\EJBWalker.g:17:12: ( ^( SCHEMA ID ( set_property )* ( schema_def )* ) )
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\EJBWalker.g:18:2: ^( SCHEMA ID ( set_property )* ( schema_def )* )
            {
            match(input,SCHEMA,FOLLOW_SCHEMA_in_schema_file64); 

            match(input, Token.DOWN, null); 
            ID1=(CommonTree)match(input,ID,FOLLOW_ID_in_schema_file66); 

            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\EJBWalker.g:18:14: ( set_property )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==SET) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\EJBWalker.g:18:14: set_property
            	    {
            	    pushFollow(FOLLOW_set_property_in_schema_file68);
            	    set_property();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\EJBWalker.g:18:28: ( schema_def )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==DOMAIN||(LA2_0 >= ELEMENT && LA2_0 <= ENTITY)||LA2_0==LINK) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\EJBWalker.g:18:28: schema_def
            	    {
            	    pushFollow(FOLLOW_schema_def_in_schema_file71);
            	    schema_def();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            match(input, Token.UP, null); 


            schema.setSchemaName((ID1!=null?ID1.getText():null));

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


    public static class schema_def_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "schema_def"
    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\EJBWalker.g:21:1: schema_def : ( entity_def | dom_def | elem_def | link_def );
    public final EJBWalker.schema_def_return schema_def() throws RecognitionException {
        EJBWalker.schema_def_return retval = new EJBWalker.schema_def_return();
        retval.start = input.LT(1);


        try {
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\EJBWalker.g:21:11: ( entity_def | dom_def | elem_def | link_def )
            int alt3=4;
            switch ( input.LA(1) ) {
            case ENTITY:
                {
                alt3=1;
                }
                break;
            case DOMAIN:
                {
                alt3=2;
                }
                break;
            case ELEMENT:
                {
                alt3=3;
                }
                break;
            case LINK:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }

            switch (alt3) {
                case 1 :
                    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\EJBWalker.g:22:4: entity_def
                    {
                    pushFollow(FOLLOW_entity_def_in_schema_def87);
                    entity_def();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\EJBWalker.g:23:4: dom_def
                    {
                    pushFollow(FOLLOW_dom_def_in_schema_def92);
                    dom_def();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\EJBWalker.g:24:4: elem_def
                    {
                    pushFollow(FOLLOW_elem_def_in_schema_def97);
                    elem_def();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\EJBWalker.g:25:4: link_def
                    {
                    pushFollow(FOLLOW_link_def_in_schema_def102);
                    link_def();

                    state._fsp--;


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
    // $ANTLR end "schema_def"


    public static class set_property_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "set_property"
    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\EJBWalker.g:31:1: set_property : ^( SET ID STRING ) ;
    public final EJBWalker.set_property_return set_property() throws RecognitionException {
        EJBWalker.set_property_return retval = new EJBWalker.set_property_return();
        retval.start = input.LT(1);


        try {
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\EJBWalker.g:31:13: ( ^( SET ID STRING ) )
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\EJBWalker.g:32:2: ^( SET ID STRING )
            {
            match(input,SET,FOLLOW_SET_in_set_property115); 

            match(input, Token.DOWN, null); 
            match(input,ID,FOLLOW_ID_in_set_property117); 

            match(input,STRING,FOLLOW_STRING_in_set_property119); 

            match(input, Token.UP, null); 


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
    // $ANTLR end "set_property"


    public static class entity_def_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "entity_def"
    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\EJBWalker.g:35:1: entity_def : ^( ENTITY ID ( elem_use )+ ) -> pojo_class(;
    public final EJBWalker.entity_def_return entity_def() throws RecognitionException {
        EJBWalker.entity_def_return retval = new EJBWalker.entity_def_return();
        retval.start = input.LT(1);


        try {
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\EJBWalker.g:35:11: ( ^( ENTITY ID ( elem_use )+ ) -> pojo_class()
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\EJBWalker.g:36:2: ^( ENTITY ID ( elem_use )+ )
            {
            match(input,ENTITY,FOLLOW_ENTITY_in_entity_def132); 

            match(input, Token.DOWN, null); 
            match(input,ID,FOLLOW_ID_in_entity_def134); 

            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\EJBWalker.g:36:14: ( elem_use )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==ELEMENT||LA4_0==KEY) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\EJBWalker.g:36:14: elem_use
            	    {
            	    pushFollow(FOLLOW_elem_use_in_entity_def136);
            	    elem_use();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 36:25: -> pojo_class(
            {
                retval.st = templateLib.getInstanceOf("pojo_class");
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


    public static class link_def_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "link_def"
    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\EJBWalker.g:40:1: link_def : ^( LINK id= ID (dir= FROM |dir= BETWEEN ) left_side= ID (left_card= ONE |left_card= MANY ) right_side= ID (right_card= ONE |right_card= MANY ) ) ;
    public final EJBWalker.link_def_return link_def() throws RecognitionException {
        EJBWalker.link_def_return retval = new EJBWalker.link_def_return();
        retval.start = input.LT(1);


        CommonTree id=null;
        CommonTree dir=null;
        CommonTree left_side=null;
        CommonTree left_card=null;
        CommonTree right_side=null;
        CommonTree right_card=null;

        try {
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\EJBWalker.g:40:9: ( ^( LINK id= ID (dir= FROM |dir= BETWEEN ) left_side= ID (left_card= ONE |left_card= MANY ) right_side= ID (right_card= ONE |right_card= MANY ) ) )
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\EJBWalker.g:41:3: ^( LINK id= ID (dir= FROM |dir= BETWEEN ) left_side= ID (left_card= ONE |left_card= MANY ) right_side= ID (right_card= ONE |right_card= MANY ) )
            {
            match(input,LINK,FOLLOW_LINK_in_link_def157); 

            match(input, Token.DOWN, null); 
            id=(CommonTree)match(input,ID,FOLLOW_ID_in_link_def161); 

            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\EJBWalker.g:41:16: (dir= FROM |dir= BETWEEN )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==FROM) ) {
                alt5=1;
            }
            else if ( (LA5_0==BETWEEN) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\EJBWalker.g:41:17: dir= FROM
                    {
                    dir=(CommonTree)match(input,FROM,FOLLOW_FROM_in_link_def166); 

                    }
                    break;
                case 2 :
                    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\EJBWalker.g:41:26: dir= BETWEEN
                    {
                    dir=(CommonTree)match(input,BETWEEN,FOLLOW_BETWEEN_in_link_def170); 

                    }
                    break;

            }


            left_side=(CommonTree)match(input,ID,FOLLOW_ID_in_link_def175); 

            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\EJBWalker.g:41:52: (left_card= ONE |left_card= MANY )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==ONE) ) {
                alt6=1;
            }
            else if ( (LA6_0==MANY) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }
            switch (alt6) {
                case 1 :
                    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\EJBWalker.g:41:53: left_card= ONE
                    {
                    left_card=(CommonTree)match(input,ONE,FOLLOW_ONE_in_link_def180); 

                    }
                    break;
                case 2 :
                    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\EJBWalker.g:41:67: left_card= MANY
                    {
                    left_card=(CommonTree)match(input,MANY,FOLLOW_MANY_in_link_def184); 

                    }
                    break;

            }


            right_side=(CommonTree)match(input,ID,FOLLOW_ID_in_link_def189); 

            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\EJBWalker.g:41:97: (right_card= ONE |right_card= MANY )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==ONE) ) {
                alt7=1;
            }
            else if ( (LA7_0==MANY) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }
            switch (alt7) {
                case 1 :
                    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\EJBWalker.g:41:98: right_card= ONE
                    {
                    right_card=(CommonTree)match(input,ONE,FOLLOW_ONE_in_link_def194); 

                    }
                    break;
                case 2 :
                    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\EJBWalker.g:41:113: right_card= MANY
                    {
                    right_card=(CommonTree)match(input,MANY,FOLLOW_MANY_in_link_def198); 

                    }
                    break;

            }


            match(input, Token.UP, null); 



            		schema.addSchemaLink((id!=null?id.getText():null), (left_side!=null?left_side.getText():null), (right_side!=null?right_side.getText():null), (left_card!=null?left_card.getText():null), (right_card!=null?right_card.getText():null), (dir!=null?dir.getText():null));
            	

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
    // $ANTLR end "link_def"


    public static class dom_def_return extends TreeRuleReturnScope {
        public String domainID;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "dom_def"
    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\EJBWalker.g:47:1: dom_def returns [String domainID] : ^( DOMAIN ID (t= TYPE_STRING |t= TYPE_INT |t= TYPE_NUMBER |t= TYPE_TIMESTAMP |t= TYPE_DATE ) ( LENGTH l= INT ( PRECISION p= INT )? )? ) ;
    public final EJBWalker.dom_def_return dom_def() throws RecognitionException {
        EJBWalker.dom_def_return retval = new EJBWalker.dom_def_return();
        retval.start = input.LT(1);


        CommonTree t=null;
        CommonTree l=null;
        CommonTree p=null;
        CommonTree ID2=null;

        try {
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\EJBWalker.g:47:33: ( ^( DOMAIN ID (t= TYPE_STRING |t= TYPE_INT |t= TYPE_NUMBER |t= TYPE_TIMESTAMP |t= TYPE_DATE ) ( LENGTH l= INT ( PRECISION p= INT )? )? ) )
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\EJBWalker.g:48:2: ^( DOMAIN ID (t= TYPE_STRING |t= TYPE_INT |t= TYPE_NUMBER |t= TYPE_TIMESTAMP |t= TYPE_DATE ) ( LENGTH l= INT ( PRECISION p= INT )? )? )
            {
            match(input,DOMAIN,FOLLOW_DOMAIN_in_dom_def217); 

            match(input, Token.DOWN, null); 
            ID2=(CommonTree)match(input,ID,FOLLOW_ID_in_dom_def219); 

            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\EJBWalker.g:48:14: (t= TYPE_STRING |t= TYPE_INT |t= TYPE_NUMBER |t= TYPE_TIMESTAMP |t= TYPE_DATE )
            int alt8=5;
            switch ( input.LA(1) ) {
            case TYPE_STRING:
                {
                alt8=1;
                }
                break;
            case TYPE_INT:
                {
                alt8=2;
                }
                break;
            case TYPE_NUMBER:
                {
                alt8=3;
                }
                break;
            case TYPE_TIMESTAMP:
                {
                alt8=4;
                }
                break;
            case TYPE_DATE:
                {
                alt8=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }

            switch (alt8) {
                case 1 :
                    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\EJBWalker.g:48:15: t= TYPE_STRING
                    {
                    t=(CommonTree)match(input,TYPE_STRING,FOLLOW_TYPE_STRING_in_dom_def224); 

                    }
                    break;
                case 2 :
                    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\EJBWalker.g:48:31: t= TYPE_INT
                    {
                    t=(CommonTree)match(input,TYPE_INT,FOLLOW_TYPE_INT_in_dom_def230); 

                    }
                    break;
                case 3 :
                    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\EJBWalker.g:48:44: t= TYPE_NUMBER
                    {
                    t=(CommonTree)match(input,TYPE_NUMBER,FOLLOW_TYPE_NUMBER_in_dom_def236); 

                    }
                    break;
                case 4 :
                    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\EJBWalker.g:48:60: t= TYPE_TIMESTAMP
                    {
                    t=(CommonTree)match(input,TYPE_TIMESTAMP,FOLLOW_TYPE_TIMESTAMP_in_dom_def242); 

                    }
                    break;
                case 5 :
                    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\EJBWalker.g:48:79: t= TYPE_DATE
                    {
                    t=(CommonTree)match(input,TYPE_DATE,FOLLOW_TYPE_DATE_in_dom_def248); 

                    }
                    break;

            }


            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\EJBWalker.g:48:92: ( LENGTH l= INT ( PRECISION p= INT )? )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==LENGTH) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\EJBWalker.g:48:93: LENGTH l= INT ( PRECISION p= INT )?
                    {
                    match(input,LENGTH,FOLLOW_LENGTH_in_dom_def252); 

                    l=(CommonTree)match(input,INT,FOLLOW_INT_in_dom_def256); 

                    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\EJBWalker.g:48:106: ( PRECISION p= INT )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==PRECISION) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\EJBWalker.g:48:107: PRECISION p= INT
                            {
                            match(input,PRECISION,FOLLOW_PRECISION_in_dom_def259); 

                            p=(CommonTree)match(input,INT,FOLLOW_INT_in_dom_def263); 

                            }
                            break;

                    }


                    }
                    break;

            }


            match(input, Token.UP, null); 


            schema.addDomain((ID2!=null?ID2.getText():null), (t!=null?t.getText():null), (l!=null?l.getText():null), (p!=null?p.getText():null));
            	retval.domainID = (ID2!=null?ID2.getText():null);

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
    // $ANTLR end "dom_def"


    public static class dom_use_return extends TreeRuleReturnScope {
        public String domainID;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "dom_use"
    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\EJBWalker.g:53:1: dom_use returns [String domainID] : ( dom_def | ^( DOMAIN ID ) );
    public final EJBWalker.dom_use_return dom_use() throws RecognitionException {
        EJBWalker.dom_use_return retval = new EJBWalker.dom_use_return();
        retval.start = input.LT(1);


        CommonTree ID4=null;
        EJBWalker.dom_def_return dom_def3 =null;


        try {
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\EJBWalker.g:53:33: ( dom_def | ^( DOMAIN ID ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==DOMAIN) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==DOWN) ) {
                    int LA11_2 = input.LA(3);

                    if ( (LA11_2==ID) ) {
                        int LA11_3 = input.LA(4);

                        if ( (LA11_3==UP) ) {
                            alt11=2;
                        }
                        else if ( ((LA11_3 >= TYPE_DATE && LA11_3 <= TYPE_TIMESTAMP)) ) {
                            alt11=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 11, 3, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 2, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;

            }
            switch (alt11) {
                case 1 :
                    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\EJBWalker.g:54:2: dom_def
                    {
                    pushFollow(FOLLOW_dom_def_in_dom_use287);
                    dom_def3=dom_def();

                    state._fsp--;


                    retval.domainID = (dom_def3!=null?dom_def3.domainID:null);

                    }
                    break;
                case 2 :
                    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\EJBWalker.g:55:2: ^( DOMAIN ID )
                    {
                    match(input,DOMAIN,FOLLOW_DOMAIN_in_dom_use294); 

                    match(input, Token.DOWN, null); 
                    ID4=(CommonTree)match(input,ID,FOLLOW_ID_in_dom_use296); 

                    match(input, Token.UP, null); 


                    retval.domainID = (ID4!=null?ID4.getText():null);

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
    // $ANTLR end "dom_use"


    public static class elem_def_return extends TreeRuleReturnScope {
        public String elementID;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "elem_def"
    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\EJBWalker.g:58:1: elem_def returns [String elementID] : ^( ELEMENT id= ID ( STEXT s= STRING )? ( MTEXT m= STRING )? ( LTEXT l= STRING )? dom_use ) ;
    public final EJBWalker.elem_def_return elem_def() throws RecognitionException {
        EJBWalker.elem_def_return retval = new EJBWalker.elem_def_return();
        retval.start = input.LT(1);


        CommonTree id=null;
        CommonTree s=null;
        CommonTree m=null;
        CommonTree l=null;
        EJBWalker.dom_use_return dom_use5 =null;


        try {
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\EJBWalker.g:58:35: ( ^( ELEMENT id= ID ( STEXT s= STRING )? ( MTEXT m= STRING )? ( LTEXT l= STRING )? dom_use ) )
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\EJBWalker.g:59:2: ^( ELEMENT id= ID ( STEXT s= STRING )? ( MTEXT m= STRING )? ( LTEXT l= STRING )? dom_use )
            {
            match(input,ELEMENT,FOLLOW_ELEMENT_in_elem_def314); 

            match(input, Token.DOWN, null); 
            id=(CommonTree)match(input,ID,FOLLOW_ID_in_elem_def318); 

            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\EJBWalker.g:59:18: ( STEXT s= STRING )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==STEXT) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\EJBWalker.g:59:19: STEXT s= STRING
                    {
                    match(input,STEXT,FOLLOW_STEXT_in_elem_def321); 

                    s=(CommonTree)match(input,STRING,FOLLOW_STRING_in_elem_def325); 

                    }
                    break;

            }


            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\EJBWalker.g:59:36: ( MTEXT m= STRING )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==MTEXT) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\EJBWalker.g:59:37: MTEXT m= STRING
                    {
                    match(input,MTEXT,FOLLOW_MTEXT_in_elem_def330); 

                    m=(CommonTree)match(input,STRING,FOLLOW_STRING_in_elem_def334); 

                    }
                    break;

            }


            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\EJBWalker.g:59:54: ( LTEXT l= STRING )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==LTEXT) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\EJBWalker.g:59:55: LTEXT l= STRING
                    {
                    match(input,LTEXT,FOLLOW_LTEXT_in_elem_def339); 

                    l=(CommonTree)match(input,STRING,FOLLOW_STRING_in_elem_def343); 

                    }
                    break;

            }


            pushFollow(FOLLOW_dom_use_in_elem_def347);
            dom_use5=dom_use();

            state._fsp--;


            match(input, Token.UP, null); 



            	schema.addElement((id!=null?id.getText():null), (s!=null?s.getText():null), (m!=null?m.getText():null), (l!=null?l.getText():null), schema.findDomain((dom_use5!=null?dom_use5.domainID:null)));
            	retval.elementID = (id!=null?id.getText():null);
            	

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
    // $ANTLR end "elem_def"


    public static class key_elem_def_return extends TreeRuleReturnScope {
        public String elementID;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "key_elem_def"
    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\EJBWalker.g:67:1: key_elem_def returns [String elementID] : ( ^( KEY ed= elem_def ) | ^( KEY ne= named_elem ) );
    public final EJBWalker.key_elem_def_return key_elem_def() throws RecognitionException {
        EJBWalker.key_elem_def_return retval = new EJBWalker.key_elem_def_return();
        retval.start = input.LT(1);


        EJBWalker.elem_def_return ed =null;

        EJBWalker.named_elem_return ne =null;


        try {
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\EJBWalker.g:67:39: ( ^( KEY ed= elem_def ) | ^( KEY ne= named_elem ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==KEY) ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==DOWN) ) {
                    int LA15_2 = input.LA(3);

                    if ( (LA15_2==ELEMENT) ) {
                        int LA15_3 = input.LA(4);

                        if ( (LA15_3==DOWN) ) {
                            int LA15_4 = input.LA(5);

                            if ( (LA15_4==ID) ) {
                                int LA15_5 = input.LA(6);

                                if ( (LA15_5==UP) ) {
                                    alt15=2;
                                }
                                else if ( (LA15_5==DOMAIN||LA15_5==LTEXT||LA15_5==MTEXT||LA15_5==STEXT) ) {
                                    alt15=1;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 15, 5, input);

                                    throw nvae;

                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 15, 4, input);

                                throw nvae;

                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 15, 3, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 15, 2, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;

            }
            switch (alt15) {
                case 1 :
                    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\EJBWalker.g:68:2: ^( KEY ed= elem_def )
                    {
                    match(input,KEY,FOLLOW_KEY_in_key_elem_def367); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_elem_def_in_key_elem_def371);
                    ed=elem_def();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    retval.elementID = (ed!=null?ed.elementID:null);

                    }
                    break;
                case 2 :
                    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\EJBWalker.g:69:2: ^( KEY ne= named_elem )
                    {
                    match(input,KEY,FOLLOW_KEY_in_key_elem_def379); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_named_elem_in_key_elem_def383);
                    ne=named_elem();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    retval.elementID = (ne!=null?ne.elementID:null);

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
    // $ANTLR end "key_elem_def"


    public static class named_elem_return extends TreeRuleReturnScope {
        public String elementID;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "named_elem"
    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\EJBWalker.g:72:1: named_elem returns [String elementID] : ^( ELEMENT ID ) ;
    public final EJBWalker.named_elem_return named_elem() throws RecognitionException {
        EJBWalker.named_elem_return retval = new EJBWalker.named_elem_return();
        retval.start = input.LT(1);


        CommonTree ID6=null;

        try {
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\EJBWalker.g:72:37: ( ^( ELEMENT ID ) )
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\EJBWalker.g:73:2: ^( ELEMENT ID )
            {
            match(input,ELEMENT,FOLLOW_ELEMENT_in_named_elem401); 

            match(input, Token.DOWN, null); 
            ID6=(CommonTree)match(input,ID,FOLLOW_ID_in_named_elem403); 

            match(input, Token.UP, null); 


            retval.elementID = (ID6!=null?ID6.getText():null);

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
    // $ANTLR end "named_elem"


    public static class elem_use_return extends TreeRuleReturnScope {
        public String elementID;
        public Boolean isKey;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "elem_use"
    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\EJBWalker.g:76:1: elem_use returns [String elementID, Boolean isKey] : ( elem_def | key_elem_def | named_elem );
    public final EJBWalker.elem_use_return elem_use() throws RecognitionException {
        EJBWalker.elem_use_return retval = new EJBWalker.elem_use_return();
        retval.start = input.LT(1);


        try {
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\EJBWalker.g:76:50: ( elem_def | key_elem_def | named_elem )
            int alt16=3;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==ELEMENT) ) {
                int LA16_1 = input.LA(2);

                if ( (LA16_1==DOWN) ) {
                    int LA16_3 = input.LA(3);

                    if ( (LA16_3==ID) ) {
                        int LA16_4 = input.LA(4);

                        if ( (LA16_4==UP) ) {
                            alt16=3;
                        }
                        else if ( (LA16_4==DOMAIN||LA16_4==LTEXT||LA16_4==MTEXT||LA16_4==STEXT) ) {
                            alt16=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 16, 4, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 16, 3, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA16_0==KEY) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;

            }
            switch (alt16) {
                case 1 :
                    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\EJBWalker.g:77:2: elem_def
                    {
                    pushFollow(FOLLOW_elem_def_in_elem_use420);
                    elem_def();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\EJBWalker.g:78:2: key_elem_def
                    {
                    pushFollow(FOLLOW_key_elem_def_in_elem_use425);
                    key_elem_def();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\EJBWalker.g:79:2: named_elem
                    {
                    pushFollow(FOLLOW_named_elem_in_elem_use430);
                    named_elem();

                    state._fsp--;


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
    // $ANTLR end "elem_use"

    // Delegated rules


 

    public static final BitSet FOLLOW_SCHEMA_in_schema_file64 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_schema_file66 = new BitSet(new long[]{0x0000000008010688L});
    public static final BitSet FOLLOW_set_property_in_schema_file68 = new BitSet(new long[]{0x0000000008010688L});
    public static final BitSet FOLLOW_schema_def_in_schema_file71 = new BitSet(new long[]{0x0000000000010688L});
    public static final BitSet FOLLOW_entity_def_in_schema_def87 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dom_def_in_schema_def92 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_elem_def_in_schema_def97 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_link_def_in_schema_def102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SET_in_set_property115 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_set_property117 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_STRING_in_set_property119 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ENTITY_in_entity_def132 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_entity_def134 = new BitSet(new long[]{0x0000000000004200L});
    public static final BitSet FOLLOW_elem_use_in_entity_def136 = new BitSet(new long[]{0x0000000000004208L});
    public static final BitSet FOLLOW_LINK_in_link_def157 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_link_def161 = new BitSet(new long[]{0x0000000000000840L});
    public static final BitSet FOLLOW_FROM_in_link_def166 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_BETWEEN_in_link_def170 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ID_in_link_def175 = new BitSet(new long[]{0x0000000000880000L});
    public static final BitSet FOLLOW_ONE_in_link_def180 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_MANY_in_link_def184 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ID_in_link_def189 = new BitSet(new long[]{0x0000000000880000L});
    public static final BitSet FOLLOW_ONE_in_link_def194 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MANY_in_link_def198 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DOMAIN_in_dom_def217 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_dom_def219 = new BitSet(new long[]{0x0000003E00000000L});
    public static final BitSet FOLLOW_TYPE_STRING_in_dom_def224 = new BitSet(new long[]{0x0000000000008008L});
    public static final BitSet FOLLOW_TYPE_INT_in_dom_def230 = new BitSet(new long[]{0x0000000000008008L});
    public static final BitSet FOLLOW_TYPE_NUMBER_in_dom_def236 = new BitSet(new long[]{0x0000000000008008L});
    public static final BitSet FOLLOW_TYPE_TIMESTAMP_in_dom_def242 = new BitSet(new long[]{0x0000000000008008L});
    public static final BitSet FOLLOW_TYPE_DATE_in_dom_def248 = new BitSet(new long[]{0x0000000000008008L});
    public static final BitSet FOLLOW_LENGTH_in_dom_def252 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_INT_in_dom_def256 = new BitSet(new long[]{0x0000000001000008L});
    public static final BitSet FOLLOW_PRECISION_in_dom_def259 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_INT_in_dom_def263 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_dom_def_in_dom_use287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOMAIN_in_dom_use294 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_dom_use296 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ELEMENT_in_elem_def314 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_elem_def318 = new BitSet(new long[]{0x0000000020220080L});
    public static final BitSet FOLLOW_STEXT_in_elem_def321 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_STRING_in_elem_def325 = new BitSet(new long[]{0x0000000000220080L});
    public static final BitSet FOLLOW_MTEXT_in_elem_def330 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_STRING_in_elem_def334 = new BitSet(new long[]{0x0000000000020080L});
    public static final BitSet FOLLOW_LTEXT_in_elem_def339 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_STRING_in_elem_def343 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_dom_use_in_elem_def347 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_KEY_in_key_elem_def367 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_elem_def_in_key_elem_def371 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_KEY_in_key_elem_def379 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_named_elem_in_key_elem_def383 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ELEMENT_in_named_elem401 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_named_elem403 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_elem_def_in_elem_use420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_key_elem_def_in_elem_use425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_named_elem_in_elem_use430 = new BitSet(new long[]{0x0000000000000002L});

}