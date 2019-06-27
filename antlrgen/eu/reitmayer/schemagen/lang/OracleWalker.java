// $ANTLR 3.4 F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\OracleWalker.g 2013-06-09 23:03:30

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
public class OracleWalker extends TreeParser {
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


    public OracleWalker(TreeNodeStream input) {
        this(input, new RecognizerSharedState());
    }
    public OracleWalker(TreeNodeStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected StringTemplateGroup templateLib =
  new StringTemplateGroup("OracleWalkerTemplates", AngleBracketTemplateLexer.class);

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
    public String[] getTokenNames() { return OracleWalker.tokenNames; }
    public String getGrammarFileName() { return "F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\OracleWalker.g"; }


    	public Schema schema = new Schema();
    	public String currentEntity = "";
    	
    	public String getOracleType(String internalType) {
    	return SchemaOracleUtil.getOracleType(internalType);
    	}


    public static class schema_file_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "schema_file"
    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\OracleWalker.g:23:1: schema_file : ^( SCHEMA ID ( set_property )* (sd+= schema_def )* ) -> file(defs=$sd);
    public final OracleWalker.schema_file_return schema_file() throws RecognitionException {
        OracleWalker.schema_file_return retval = new OracleWalker.schema_file_return();
        retval.start = input.LT(1);


        List list_sd=null;
        RuleReturnScope sd = null;
        try {
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\OracleWalker.g:23:12: ( ^( SCHEMA ID ( set_property )* (sd+= schema_def )* ) -> file(defs=$sd))
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\OracleWalker.g:24:2: ^( SCHEMA ID ( set_property )* (sd+= schema_def )* )
            {
            match(input,SCHEMA,FOLLOW_SCHEMA_in_schema_file65); 

            match(input, Token.DOWN, null); 
            match(input,ID,FOLLOW_ID_in_schema_file67); 

            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\OracleWalker.g:24:14: ( set_property )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==SET) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\OracleWalker.g:24:14: set_property
            	    {
            	    pushFollow(FOLLOW_set_property_in_schema_file69);
            	    set_property();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\OracleWalker.g:24:30: (sd+= schema_def )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==DOMAIN||(LA2_0 >= ELEMENT && LA2_0 <= ENTITY)||LA2_0==LINK) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\OracleWalker.g:24:30: sd+= schema_def
            	    {
            	    pushFollow(FOLLOW_schema_def_in_schema_file74);
            	    sd=schema_def();

            	    state._fsp--;

            	    if (list_sd==null) list_sd=new ArrayList();
            	    list_sd.add(sd.getTemplate());


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 24:45: -> file(defs=$sd)
            {
                retval.st = templateLib.getInstanceOf("file",new STAttrMap().put("defs", list_sd));
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


    public static class schema_def_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "schema_def"
    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\OracleWalker.g:28:1: schema_def : (e= entity_def -> {$e.st}| dom_def | elem_def |ld= link_def -> {$ld.st});
    public final OracleWalker.schema_def_return schema_def() throws RecognitionException {
        OracleWalker.schema_def_return retval = new OracleWalker.schema_def_return();
        retval.start = input.LT(1);


        OracleWalker.entity_def_return e =null;

        OracleWalker.link_def_return ld =null;


        try {
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\OracleWalker.g:28:11: (e= entity_def -> {$e.st}| dom_def | elem_def |ld= link_def -> {$ld.st})
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
                    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\OracleWalker.g:29:4: e= entity_def
                    {
                    pushFollow(FOLLOW_entity_def_in_schema_def101);
                    e=entity_def();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 29:17: -> {$e.st}
                    {
                        retval.st = (e!=null?e.st:null);
                    }



                    }
                    break;
                case 2 :
                    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\OracleWalker.g:30:4: dom_def
                    {
                    pushFollow(FOLLOW_dom_def_in_schema_def110);
                    dom_def();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\OracleWalker.g:31:4: elem_def
                    {
                    pushFollow(FOLLOW_elem_def_in_schema_def116);
                    elem_def();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\OracleWalker.g:32:4: ld= link_def
                    {
                    pushFollow(FOLLOW_link_def_in_schema_def124);
                    ld=link_def();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 32:16: -> {$ld.st}
                    {
                        retval.st = (ld!=null?ld.st:null);
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
    // $ANTLR end "schema_def"


    public static class set_property_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "set_property"
    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\OracleWalker.g:36:1: set_property : ^( SET ID STRING ) ;
    public final OracleWalker.set_property_return set_property() throws RecognitionException {
        OracleWalker.set_property_return retval = new OracleWalker.set_property_return();
        retval.start = input.LT(1);


        try {
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\OracleWalker.g:36:13: ( ^( SET ID STRING ) )
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\OracleWalker.g:37:2: ^( SET ID STRING )
            {
            match(input,SET,FOLLOW_SET_in_set_property139); 

            match(input, Token.DOWN, null); 
            match(input,ID,FOLLOW_ID_in_set_property141); 

            match(input,STRING,FOLLOW_STRING_in_set_property143); 

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
    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\OracleWalker.g:40:1: entity_def : ^( ENTITY ID (eu+= elem_use )+ ) -> table(name=$ID.textcols=$euforeignKeys=SchemaOracleUtil.getForeignKeyDefinitions(schema, $ID.text)keys=schema.getKeysOfEntity($ID.text)line=$ENTITY.line);
    public final OracleWalker.entity_def_return entity_def() throws RecognitionException {
        OracleWalker.entity_def_return retval = new OracleWalker.entity_def_return();
        retval.start = input.LT(1);


        CommonTree ID1=null;
        CommonTree ENTITY2=null;
        List list_eu=null;
        RuleReturnScope eu = null;
        try {
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\OracleWalker.g:40:11: ( ^( ENTITY ID (eu+= elem_use )+ ) -> table(name=$ID.textcols=$euforeignKeys=SchemaOracleUtil.getForeignKeyDefinitions(schema, $ID.text)keys=schema.getKeysOfEntity($ID.text)line=$ENTITY.line))
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\OracleWalker.g:41:2: ^( ENTITY ID (eu+= elem_use )+ )
            {
            ENTITY2=(CommonTree)match(input,ENTITY,FOLLOW_ENTITY_in_entity_def157); 

            match(input, Token.DOWN, null); 
            ID1=(CommonTree)match(input,ID,FOLLOW_ID_in_entity_def159); 

            currentEntity = (ID1!=null?ID1.getText():null);

            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\OracleWalker.g:41:44: (eu+= elem_use )+
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
            	    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\OracleWalker.g:41:44: eu+= elem_use
            	    {
            	    pushFollow(FOLLOW_elem_use_in_entity_def165);
            	    eu=elem_use();

            	    state._fsp--;

            	    if (list_eu==null) list_eu=new ArrayList();
            	    list_eu.add(eu.getTemplate());


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
            // 41:57: -> table(name=$ID.textcols=$euforeignKeys=SchemaOracleUtil.getForeignKeyDefinitions(schema, $ID.text)keys=schema.getKeysOfEntity($ID.text)line=$ENTITY.line)
            {
                retval.st = templateLib.getInstanceOf("table",new STAttrMap().put("name", (ID1!=null?ID1.getText():null)).put("cols", list_eu).put("foreignKeys", SchemaOracleUtil.getForeignKeyDefinitions(schema, (ID1!=null?ID1.getText():null))).put("keys", schema.getKeysOfEntity((ID1!=null?ID1.getText():null))).put("line", (ENTITY2!=null?ENTITY2.getLine():0)));
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
    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\OracleWalker.g:48:1: link_def : ^( LINK id= ID (dir= FROM |dir= BETWEEN ) left_side= ID (left_card= ONE |left_card= MANY ) right_side= ID (right_card= ONE |right_card= MANY ) ) -> link_definition(leftSide=leftSiderightSide=rightSidelinkTableManyToMany=linkTableManyToManylinkId=$id.textleftId=$left_side.textleftForeignKeys=schema.findEntity($left_side.text).getForeignKeyIds($id.text)rightForeignKeys=schema.findEntity($right_side.text).getForeignKeyIds($id.text)rightId=$right_side.textrightKeys=schema.findEntity($right_side.text).getKeyIds()leftKeys=schema.findEntity($left_side.text).getKeyIds()linkTableCols=SchemaOracleUtil.getLinkTableColumns(schema, $left_side.text, $right_side.text)line=$LINK.line);
    public final OracleWalker.link_def_return link_def() throws RecognitionException {
        OracleWalker.link_def_return retval = new OracleWalker.link_def_return();
        retval.start = input.LT(1);


        CommonTree id=null;
        CommonTree dir=null;
        CommonTree left_side=null;
        CommonTree left_card=null;
        CommonTree right_side=null;
        CommonTree right_card=null;
        CommonTree LINK3=null;


        		String leftSide = null;
        		String rightSide = null;
        		String linkTableManyToMany = null;
        		String linkOneToOne = null;
        	
        try {
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\OracleWalker.g:55:2: ( ^( LINK id= ID (dir= FROM |dir= BETWEEN ) left_side= ID (left_card= ONE |left_card= MANY ) right_side= ID (right_card= ONE |right_card= MANY ) ) -> link_definition(leftSide=leftSiderightSide=rightSidelinkTableManyToMany=linkTableManyToManylinkId=$id.textleftId=$left_side.textleftForeignKeys=schema.findEntity($left_side.text).getForeignKeyIds($id.text)rightForeignKeys=schema.findEntity($right_side.text).getForeignKeyIds($id.text)rightId=$right_side.textrightKeys=schema.findEntity($right_side.text).getKeyIds()leftKeys=schema.findEntity($left_side.text).getKeyIds()linkTableCols=SchemaOracleUtil.getLinkTableColumns(schema, $left_side.text, $right_side.text)line=$LINK.line))
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\OracleWalker.g:56:3: ^( LINK id= ID (dir= FROM |dir= BETWEEN ) left_side= ID (left_card= ONE |left_card= MANY ) right_side= ID (right_card= ONE |right_card= MANY ) )
            {
            LINK3=(CommonTree)match(input,LINK,FOLLOW_LINK_in_link_def348); 

            match(input, Token.DOWN, null); 
            id=(CommonTree)match(input,ID,FOLLOW_ID_in_link_def352); 

            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\OracleWalker.g:56:16: (dir= FROM |dir= BETWEEN )
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
                    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\OracleWalker.g:56:17: dir= FROM
                    {
                    dir=(CommonTree)match(input,FROM,FOLLOW_FROM_in_link_def357); 

                    }
                    break;
                case 2 :
                    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\OracleWalker.g:56:26: dir= BETWEEN
                    {
                    dir=(CommonTree)match(input,BETWEEN,FOLLOW_BETWEEN_in_link_def361); 

                    }
                    break;

            }


            left_side=(CommonTree)match(input,ID,FOLLOW_ID_in_link_def366); 

            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\OracleWalker.g:56:52: (left_card= ONE |left_card= MANY )
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
                    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\OracleWalker.g:56:53: left_card= ONE
                    {
                    left_card=(CommonTree)match(input,ONE,FOLLOW_ONE_in_link_def371); 

                    }
                    break;
                case 2 :
                    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\OracleWalker.g:56:67: left_card= MANY
                    {
                    left_card=(CommonTree)match(input,MANY,FOLLOW_MANY_in_link_def375); 

                    }
                    break;

            }


            right_side=(CommonTree)match(input,ID,FOLLOW_ID_in_link_def380); 

            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\OracleWalker.g:56:97: (right_card= ONE |right_card= MANY )
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
                    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\OracleWalker.g:56:98: right_card= ONE
                    {
                    right_card=(CommonTree)match(input,ONE,FOLLOW_ONE_in_link_def385); 

                    }
                    break;
                case 2 :
                    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\OracleWalker.g:56:113: right_card= MANY
                    {
                    right_card=(CommonTree)match(input,MANY,FOLLOW_MANY_in_link_def389); 

                    }
                    break;

            }


            match(input, Token.UP, null); 



            	 		if ((left_card!=null?left_card.getText():null).equals("ONE") && (right_card!=null?right_card.getText():null).equals("MANY")) {
            	 			rightSide = "X";
            	 		} else if ((left_card!=null?left_card.getText():null).equals("MANY") && (right_card!=null?right_card.getText():null).equals("ONE")) {
            	 			leftSide = "X";
            	 		} else if ((left_card!=null?left_card.getText():null).equals("MANY") && (right_card!=null?right_card.getText():null).equals("MANY")) {
            	 			linkTableManyToMany = "X";
            	 		} else {
            	 			linkOneToOne = "X";
            	 		}
            	 

            // TEMPLATE REWRITE
            // 67:5: -> link_definition(leftSide=leftSiderightSide=rightSidelinkTableManyToMany=linkTableManyToManylinkId=$id.textleftId=$left_side.textleftForeignKeys=schema.findEntity($left_side.text).getForeignKeyIds($id.text)rightForeignKeys=schema.findEntity($right_side.text).getForeignKeyIds($id.text)rightId=$right_side.textrightKeys=schema.findEntity($right_side.text).getKeyIds()leftKeys=schema.findEntity($left_side.text).getKeyIds()linkTableCols=SchemaOracleUtil.getLinkTableColumns(schema, $left_side.text, $right_side.text)line=$LINK.line)
            {
                retval.st = templateLib.getInstanceOf("link_definition",new STAttrMap().put("leftSide", leftSide).put("rightSide", rightSide).put("linkTableManyToMany", linkTableManyToMany).put("linkId", (id!=null?id.getText():null)).put("leftId", (left_side!=null?left_side.getText():null)).put("leftForeignKeys", schema.findEntity((left_side!=null?left_side.getText():null)).getForeignKeyIds((id!=null?id.getText():null))).put("rightForeignKeys", schema.findEntity((right_side!=null?right_side.getText():null)).getForeignKeyIds((id!=null?id.getText():null))).put("rightId", (right_side!=null?right_side.getText():null)).put("rightKeys", schema.findEntity((right_side!=null?right_side.getText():null)).getKeyIds()).put("leftKeys", schema.findEntity((left_side!=null?left_side.getText():null)).getKeyIds()).put("linkTableCols", SchemaOracleUtil.getLinkTableColumns(schema, (left_side!=null?left_side.getText():null), (right_side!=null?right_side.getText():null))).put("line", (LINK3!=null?LINK3.getLine():0)));
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
    // $ANTLR end "link_def"


    public static class dom_def_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "dom_def"
    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\OracleWalker.g:83:1: dom_def : ^( DOMAIN ID (t= TYPE_STRING |t= TYPE_INT |t= TYPE_NUMBER |t= TYPE_TIMESTAMP |t= TYPE_DATE ) ( LENGTH l= INT ( PRECISION p= INT )? )? ) -> typedef(type=getOracleType($t.text)len=$l.textprecision=$p.text);
    public final OracleWalker.dom_def_return dom_def() throws RecognitionException {
        OracleWalker.dom_def_return retval = new OracleWalker.dom_def_return();
        retval.start = input.LT(1);


        CommonTree t=null;
        CommonTree l=null;
        CommonTree p=null;

        try {
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\OracleWalker.g:83:8: ( ^( DOMAIN ID (t= TYPE_STRING |t= TYPE_INT |t= TYPE_NUMBER |t= TYPE_TIMESTAMP |t= TYPE_DATE ) ( LENGTH l= INT ( PRECISION p= INT )? )? ) -> typedef(type=getOracleType($t.text)len=$l.textprecision=$p.text))
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\OracleWalker.g:84:3: ^( DOMAIN ID (t= TYPE_STRING |t= TYPE_INT |t= TYPE_NUMBER |t= TYPE_TIMESTAMP |t= TYPE_DATE ) ( LENGTH l= INT ( PRECISION p= INT )? )? )
            {
            match(input,DOMAIN,FOLLOW_DOMAIN_in_dom_def513); 

            match(input, Token.DOWN, null); 
            match(input,ID,FOLLOW_ID_in_dom_def515); 

            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\OracleWalker.g:84:15: (t= TYPE_STRING |t= TYPE_INT |t= TYPE_NUMBER |t= TYPE_TIMESTAMP |t= TYPE_DATE )
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
                    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\OracleWalker.g:84:16: t= TYPE_STRING
                    {
                    t=(CommonTree)match(input,TYPE_STRING,FOLLOW_TYPE_STRING_in_dom_def520); 

                    }
                    break;
                case 2 :
                    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\OracleWalker.g:84:32: t= TYPE_INT
                    {
                    t=(CommonTree)match(input,TYPE_INT,FOLLOW_TYPE_INT_in_dom_def526); 

                    }
                    break;
                case 3 :
                    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\OracleWalker.g:84:45: t= TYPE_NUMBER
                    {
                    t=(CommonTree)match(input,TYPE_NUMBER,FOLLOW_TYPE_NUMBER_in_dom_def532); 

                    }
                    break;
                case 4 :
                    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\OracleWalker.g:84:61: t= TYPE_TIMESTAMP
                    {
                    t=(CommonTree)match(input,TYPE_TIMESTAMP,FOLLOW_TYPE_TIMESTAMP_in_dom_def538); 

                    }
                    break;
                case 5 :
                    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\OracleWalker.g:84:80: t= TYPE_DATE
                    {
                    t=(CommonTree)match(input,TYPE_DATE,FOLLOW_TYPE_DATE_in_dom_def544); 

                    }
                    break;

            }


            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\OracleWalker.g:84:93: ( LENGTH l= INT ( PRECISION p= INT )? )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==LENGTH) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\OracleWalker.g:84:94: LENGTH l= INT ( PRECISION p= INT )?
                    {
                    match(input,LENGTH,FOLLOW_LENGTH_in_dom_def548); 

                    l=(CommonTree)match(input,INT,FOLLOW_INT_in_dom_def552); 

                    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\OracleWalker.g:84:107: ( PRECISION p= INT )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==PRECISION) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\OracleWalker.g:84:108: PRECISION p= INT
                            {
                            match(input,PRECISION,FOLLOW_PRECISION_in_dom_def555); 

                            p=(CommonTree)match(input,INT,FOLLOW_INT_in_dom_def559); 

                            }
                            break;

                    }


                    }
                    break;

            }


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 85:4: -> typedef(type=getOracleType($t.text)len=$l.textprecision=$p.text)
            {
                retval.st = templateLib.getInstanceOf("typedef",new STAttrMap().put("type", getOracleType((t!=null?t.getText():null))).put("len", (l!=null?l.getText():null)).put("precision", (p!=null?p.getText():null)));
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
    // $ANTLR end "dom_def"


    public static class dom_use_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "dom_use"
    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\OracleWalker.g:88:1: dom_use : (dd= dom_def -> {$dd.st}| ^( DOMAIN ID ) -> typedef(type=getOracleType(schema.findDomain($ID.text).type)len=schema.findDomain($ID.text).lengthprecision=schema.findDomain($ID.text).precision));
    public final OracleWalker.dom_use_return dom_use() throws RecognitionException {
        OracleWalker.dom_use_return retval = new OracleWalker.dom_use_return();
        retval.start = input.LT(1);


        CommonTree ID4=null;
        OracleWalker.dom_def_return dd =null;


        try {
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\OracleWalker.g:88:8: (dd= dom_def -> {$dd.st}| ^( DOMAIN ID ) -> typedef(type=getOracleType(schema.findDomain($ID.text).type)len=schema.findDomain($ID.text).lengthprecision=schema.findDomain($ID.text).precision))
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
                    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\OracleWalker.g:89:2: dd= dom_def
                    {
                    pushFollow(FOLLOW_dom_def_in_dom_use600);
                    dd=dom_def();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 89:13: -> {$dd.st}
                    {
                        retval.st = (dd!=null?dd.st:null);
                    }



                    }
                    break;
                case 2 :
                    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\OracleWalker.g:90:2: ^( DOMAIN ID )
                    {
                    match(input,DOMAIN,FOLLOW_DOMAIN_in_dom_use609); 

                    match(input, Token.DOWN, null); 
                    ID4=(CommonTree)match(input,ID,FOLLOW_ID_in_dom_use611); 

                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 90:15: -> typedef(type=getOracleType(schema.findDomain($ID.text).type)len=schema.findDomain($ID.text).lengthprecision=schema.findDomain($ID.text).precision)
                    {
                        retval.st = templateLib.getInstanceOf("typedef",new STAttrMap().put("type", getOracleType(schema.findDomain((ID4!=null?ID4.getText():null)).type)).put("len", schema.findDomain((ID4!=null?ID4.getText():null)).length).put("precision", schema.findDomain((ID4!=null?ID4.getText():null)).precision));
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
    // $ANTLR end "dom_use"


    public static class elem_def_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "elem_def"
    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\OracleWalker.g:93:1: elem_def : ^( ELEMENT id= ID ( STEXT s= STRING )? ( MTEXT m= STRING )? ( LTEXT l= STRING )? du= dom_use ) -> column(name=$id.texttype_def=$du.st);
    public final OracleWalker.elem_def_return elem_def() throws RecognitionException {
        OracleWalker.elem_def_return retval = new OracleWalker.elem_def_return();
        retval.start = input.LT(1);


        CommonTree id=null;
        CommonTree s=null;
        CommonTree m=null;
        CommonTree l=null;
        OracleWalker.dom_use_return du =null;


        try {
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\OracleWalker.g:93:9: ( ^( ELEMENT id= ID ( STEXT s= STRING )? ( MTEXT m= STRING )? ( LTEXT l= STRING )? du= dom_use ) -> column(name=$id.texttype_def=$du.st))
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\OracleWalker.g:94:2: ^( ELEMENT id= ID ( STEXT s= STRING )? ( MTEXT m= STRING )? ( LTEXT l= STRING )? du= dom_use )
            {
            match(input,ELEMENT,FOLLOW_ELEMENT_in_elem_def642); 

            match(input, Token.DOWN, null); 
            id=(CommonTree)match(input,ID,FOLLOW_ID_in_elem_def646); 

            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\OracleWalker.g:94:18: ( STEXT s= STRING )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==STEXT) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\OracleWalker.g:94:19: STEXT s= STRING
                    {
                    match(input,STEXT,FOLLOW_STEXT_in_elem_def649); 

                    s=(CommonTree)match(input,STRING,FOLLOW_STRING_in_elem_def653); 

                    }
                    break;

            }


            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\OracleWalker.g:94:36: ( MTEXT m= STRING )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==MTEXT) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\OracleWalker.g:94:37: MTEXT m= STRING
                    {
                    match(input,MTEXT,FOLLOW_MTEXT_in_elem_def658); 

                    m=(CommonTree)match(input,STRING,FOLLOW_STRING_in_elem_def662); 

                    }
                    break;

            }


            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\OracleWalker.g:94:54: ( LTEXT l= STRING )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==LTEXT) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\OracleWalker.g:94:55: LTEXT l= STRING
                    {
                    match(input,LTEXT,FOLLOW_LTEXT_in_elem_def667); 

                    l=(CommonTree)match(input,STRING,FOLLOW_STRING_in_elem_def671); 

                    }
                    break;

            }


            pushFollow(FOLLOW_dom_use_in_elem_def677);
            du=dom_use();

            state._fsp--;


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 94:84: -> column(name=$id.texttype_def=$du.st)
            {
                retval.st = templateLib.getInstanceOf("column",new STAttrMap().put("name", (id!=null?id.getText():null)).put("type_def", (du!=null?du.st:null)));
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
    // $ANTLR end "elem_def"


    public static class key_elem_def_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "key_elem_def"
    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\OracleWalker.g:98:1: key_elem_def : ( ^( KEY ed= elem_def ) -> {$ed.st}| ^( KEY ne= named_elem ) -> {$ne.st});
    public final OracleWalker.key_elem_def_return key_elem_def() throws RecognitionException {
        OracleWalker.key_elem_def_return retval = new OracleWalker.key_elem_def_return();
        retval.start = input.LT(1);


        OracleWalker.elem_def_return ed =null;

        OracleWalker.named_elem_return ne =null;


        try {
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\OracleWalker.g:98:13: ( ^( KEY ed= elem_def ) -> {$ed.st}| ^( KEY ne= named_elem ) -> {$ne.st})
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
                    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\OracleWalker.g:99:2: ^( KEY ed= elem_def )
                    {
                    match(input,KEY,FOLLOW_KEY_in_key_elem_def704); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_elem_def_in_key_elem_def708);
                    ed=elem_def();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 99:21: -> {$ed.st}
                    {
                        retval.st = (ed!=null?ed.st:null);
                    }



                    }
                    break;
                case 2 :
                    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\OracleWalker.g:100:2: ^( KEY ne= named_elem )
                    {
                    match(input,KEY,FOLLOW_KEY_in_key_elem_def718); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_named_elem_in_key_elem_def722);
                    ne=named_elem();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 100:23: -> {$ne.st}
                    {
                        retval.st = (ne!=null?ne.st:null);
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
    // $ANTLR end "key_elem_def"


    public static class named_elem_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "named_elem"
    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\OracleWalker.g:103:1: named_elem : ^( ELEMENT ID ) -> column_named(name=$ID.texttype=getOracleType(schema.findDomain(schema.findElement($ID.text).domain.id).type)len=schema.findDomain(schema.findElement($ID.text).domain.id).lengthprecision=schema.findDomain(schema.findElement($ID.text).domain.id).precision);
    public final OracleWalker.named_elem_return named_elem() throws RecognitionException {
        OracleWalker.named_elem_return retval = new OracleWalker.named_elem_return();
        retval.start = input.LT(1);


        CommonTree ID5=null;

        try {
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\OracleWalker.g:103:11: ( ^( ELEMENT ID ) -> column_named(name=$ID.texttype=getOracleType(schema.findDomain(schema.findElement($ID.text).domain.id).type)len=schema.findDomain(schema.findElement($ID.text).domain.id).lengthprecision=schema.findDomain(schema.findElement($ID.text).domain.id).precision))
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\OracleWalker.g:104:2: ^( ELEMENT ID )
            {
            match(input,ELEMENT,FOLLOW_ELEMENT_in_named_elem739); 

            match(input, Token.DOWN, null); 
            ID5=(CommonTree)match(input,ID,FOLLOW_ID_in_named_elem741); 

            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 104:16: -> column_named(name=$ID.texttype=getOracleType(schema.findDomain(schema.findElement($ID.text).domain.id).type)len=schema.findDomain(schema.findElement($ID.text).domain.id).lengthprecision=schema.findDomain(schema.findElement($ID.text).domain.id).precision)
            {
                retval.st = templateLib.getInstanceOf("column_named",new STAttrMap().put("name", (ID5!=null?ID5.getText():null)).put("type", getOracleType(schema.findDomain(schema.findElement((ID5!=null?ID5.getText():null)).domain.id).type)).put("len", schema.findDomain(schema.findElement((ID5!=null?ID5.getText():null)).domain.id).length).put("precision", schema.findDomain(schema.findElement((ID5!=null?ID5.getText():null)).domain.id).precision));
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
    // $ANTLR end "named_elem"


    public static class elem_use_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "elem_use"
    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\OracleWalker.g:107:1: elem_use : (ed= elem_def -> {$ed.st}|ked= key_elem_def -> {$ked.st}|ne= named_elem -> {$ne.st});
    public final OracleWalker.elem_use_return elem_use() throws RecognitionException {
        OracleWalker.elem_use_return retval = new OracleWalker.elem_use_return();
        retval.start = input.LT(1);


        OracleWalker.elem_def_return ed =null;

        OracleWalker.key_elem_def_return ked =null;

        OracleWalker.named_elem_return ne =null;


        try {
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\OracleWalker.g:107:9: (ed= elem_def -> {$ed.st}|ked= key_elem_def -> {$ked.st}|ne= named_elem -> {$ne.st})
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
                    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\OracleWalker.g:108:2: ed= elem_def
                    {
                    pushFollow(FOLLOW_elem_def_in_elem_use778);
                    ed=elem_def();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 108:14: -> {$ed.st}
                    {
                        retval.st = (ed!=null?ed.st:null);
                    }



                    }
                    break;
                case 2 :
                    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\OracleWalker.g:109:2: ked= key_elem_def
                    {
                    pushFollow(FOLLOW_key_elem_def_in_elem_use788);
                    ked=key_elem_def();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 109:19: -> {$ked.st}
                    {
                        retval.st = (ked!=null?ked.st:null);
                    }



                    }
                    break;
                case 3 :
                    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\OracleWalker.g:110:2: ne= named_elem
                    {
                    pushFollow(FOLLOW_named_elem_in_elem_use798);
                    ne=named_elem();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 110:16: -> {$ne.st}
                    {
                        retval.st = (ne!=null?ne.st:null);
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
    // $ANTLR end "elem_use"

    // Delegated rules


 

    public static final BitSet FOLLOW_SCHEMA_in_schema_file65 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_schema_file67 = new BitSet(new long[]{0x0000000008010688L});
    public static final BitSet FOLLOW_set_property_in_schema_file69 = new BitSet(new long[]{0x0000000008010688L});
    public static final BitSet FOLLOW_schema_def_in_schema_file74 = new BitSet(new long[]{0x0000000000010688L});
    public static final BitSet FOLLOW_entity_def_in_schema_def101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dom_def_in_schema_def110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_elem_def_in_schema_def116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_link_def_in_schema_def124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SET_in_set_property139 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_set_property141 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_STRING_in_set_property143 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ENTITY_in_entity_def157 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_entity_def159 = new BitSet(new long[]{0x0000000000004200L});
    public static final BitSet FOLLOW_elem_use_in_entity_def165 = new BitSet(new long[]{0x0000000000004208L});
    public static final BitSet FOLLOW_LINK_in_link_def348 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_link_def352 = new BitSet(new long[]{0x0000000000000840L});
    public static final BitSet FOLLOW_FROM_in_link_def357 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_BETWEEN_in_link_def361 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ID_in_link_def366 = new BitSet(new long[]{0x0000000000880000L});
    public static final BitSet FOLLOW_ONE_in_link_def371 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_MANY_in_link_def375 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ID_in_link_def380 = new BitSet(new long[]{0x0000000000880000L});
    public static final BitSet FOLLOW_ONE_in_link_def385 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MANY_in_link_def389 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DOMAIN_in_dom_def513 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_dom_def515 = new BitSet(new long[]{0x0000003E00000000L});
    public static final BitSet FOLLOW_TYPE_STRING_in_dom_def520 = new BitSet(new long[]{0x0000000000008008L});
    public static final BitSet FOLLOW_TYPE_INT_in_dom_def526 = new BitSet(new long[]{0x0000000000008008L});
    public static final BitSet FOLLOW_TYPE_NUMBER_in_dom_def532 = new BitSet(new long[]{0x0000000000008008L});
    public static final BitSet FOLLOW_TYPE_TIMESTAMP_in_dom_def538 = new BitSet(new long[]{0x0000000000008008L});
    public static final BitSet FOLLOW_TYPE_DATE_in_dom_def544 = new BitSet(new long[]{0x0000000000008008L});
    public static final BitSet FOLLOW_LENGTH_in_dom_def548 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_INT_in_dom_def552 = new BitSet(new long[]{0x0000000001000008L});
    public static final BitSet FOLLOW_PRECISION_in_dom_def555 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_INT_in_dom_def559 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_dom_def_in_dom_use600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOMAIN_in_dom_use609 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_dom_use611 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ELEMENT_in_elem_def642 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_elem_def646 = new BitSet(new long[]{0x0000000020220080L});
    public static final BitSet FOLLOW_STEXT_in_elem_def649 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_STRING_in_elem_def653 = new BitSet(new long[]{0x0000000000220080L});
    public static final BitSet FOLLOW_MTEXT_in_elem_def658 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_STRING_in_elem_def662 = new BitSet(new long[]{0x0000000000020080L});
    public static final BitSet FOLLOW_LTEXT_in_elem_def667 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_STRING_in_elem_def671 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_dom_use_in_elem_def677 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_KEY_in_key_elem_def704 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_elem_def_in_key_elem_def708 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_KEY_in_key_elem_def718 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_named_elem_in_key_elem_def722 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ELEMENT_in_named_elem739 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_named_elem741 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_elem_def_in_elem_use778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_key_elem_def_in_elem_use788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_named_elem_in_elem_use798 = new BitSet(new long[]{0x0000000000000002L});

}