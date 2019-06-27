// $ANTLR 3.4 F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g 2013-06-09 23:03:31

package eu.reitmayer.schemagen.lang;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Stack;
import org.antlr.stringtemplate.StringTemplateGroup;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class SchemaLangParser extends Parser {
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
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public SchemaLangParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public SchemaLangParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return SchemaLangParser.tokenNames; }
    public String getGrammarFileName() { return "F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g"; }


    	// key fields: (table, column)
    	public ArrayList<TableField> keyFields = new ArrayList<TableField>();
    	public String currentTable = "";
    	public StringTemplateGroup errorMessages;


    public static class schema_file_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "schema_file"
    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:36:1: schema_file : SCHEMA ID SEMI ( set_property )* ( schema_def )* -> ^( SCHEMA ID ( set_property )* ( schema_def )* ) ;
    public final SchemaLangParser.schema_file_return schema_file() throws RecognitionException {
        SchemaLangParser.schema_file_return retval = new SchemaLangParser.schema_file_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token SCHEMA1=null;
        Token ID2=null;
        Token SEMI3=null;
        SchemaLangParser.set_property_return set_property4 =null;

        SchemaLangParser.schema_def_return schema_def5 =null;


        Object SCHEMA1_tree=null;
        Object ID2_tree=null;
        Object SEMI3_tree=null;
        RewriteRuleTokenStream stream_SCHEMA=new RewriteRuleTokenStream(adaptor,"token SCHEMA");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleSubtreeStream stream_set_property=new RewriteRuleSubtreeStream(adaptor,"rule set_property");
        RewriteRuleSubtreeStream stream_schema_def=new RewriteRuleSubtreeStream(adaptor,"rule schema_def");
        try {
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:36:12: ( SCHEMA ID SEMI ( set_property )* ( schema_def )* -> ^( SCHEMA ID ( set_property )* ( schema_def )* ) )
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:37:2: SCHEMA ID SEMI ( set_property )* ( schema_def )*
            {
            SCHEMA1=(Token)match(input,SCHEMA,FOLLOW_SCHEMA_in_schema_file64);  
            stream_SCHEMA.add(SCHEMA1);


            ID2=(Token)match(input,ID,FOLLOW_ID_in_schema_file66);  
            stream_ID.add(ID2);


            SEMI3=(Token)match(input,SEMI,FOLLOW_SEMI_in_schema_file68);  
            stream_SEMI.add(SEMI3);


            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:38:2: ( set_property )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==SET) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:38:2: set_property
            	    {
            	    pushFollow(FOLLOW_set_property_in_schema_file73);
            	    set_property4=set_property();

            	    state._fsp--;

            	    stream_set_property.add(set_property4.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:39:2: ( schema_def )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==DOMAIN||(LA2_0 >= ELEMENT && LA2_0 <= ENTITY)||LA2_0==LINK) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:39:2: schema_def
            	    {
            	    pushFollow(FOLLOW_schema_def_in_schema_file77);
            	    schema_def5=schema_def();

            	    state._fsp--;

            	    stream_schema_def.add(schema_def5.getTree());

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            // AST REWRITE
            // elements: ID, set_property, SCHEMA, schema_def
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 39:14: -> ^( SCHEMA ID ( set_property )* ( schema_def )* )
            {
                // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:39:17: ^( SCHEMA ID ( set_property )* ( schema_def )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_SCHEMA.nextNode()
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:39:29: ( set_property )*
                while ( stream_set_property.hasNext() ) {
                    adaptor.addChild(root_1, stream_set_property.nextTree());

                }
                stream_set_property.reset();

                // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:39:43: ( schema_def )*
                while ( stream_schema_def.hasNext() ) {
                    adaptor.addChild(root_1, stream_schema_def.nextTree());

                }
                stream_schema_def.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {

            		System.out.println("Error in schema file definition");
            		reportError(re);
            		consumeUntil(input, SEMI); // throw away all until ';'
            		input.consume(); // eat the ';'
            	
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "schema_file"


    public static class schema_def_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "schema_def"
    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:48:1: schema_def : ( ( entity_def SEMI ) -> entity_def | ( dom_def SEMI ) -> dom_def | ( elem_def SEMI ) -> elem_def | ( link_def SEMI ) -> link_def );
    public final SchemaLangParser.schema_def_return schema_def() throws RecognitionException {
        SchemaLangParser.schema_def_return retval = new SchemaLangParser.schema_def_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token SEMI7=null;
        Token SEMI9=null;
        Token SEMI11=null;
        Token SEMI13=null;
        SchemaLangParser.entity_def_return entity_def6 =null;

        SchemaLangParser.dom_def_return dom_def8 =null;

        SchemaLangParser.elem_def_return elem_def10 =null;

        SchemaLangParser.link_def_return link_def12 =null;


        Object SEMI7_tree=null;
        Object SEMI9_tree=null;
        Object SEMI11_tree=null;
        Object SEMI13_tree=null;
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleSubtreeStream stream_entity_def=new RewriteRuleSubtreeStream(adaptor,"rule entity_def");
        RewriteRuleSubtreeStream stream_elem_def=new RewriteRuleSubtreeStream(adaptor,"rule elem_def");
        RewriteRuleSubtreeStream stream_link_def=new RewriteRuleSubtreeStream(adaptor,"rule link_def");
        RewriteRuleSubtreeStream stream_dom_def=new RewriteRuleSubtreeStream(adaptor,"rule dom_def");
        try {
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:48:11: ( ( entity_def SEMI ) -> entity_def | ( dom_def SEMI ) -> dom_def | ( elem_def SEMI ) -> elem_def | ( link_def SEMI ) -> link_def )
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
                    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:49:3: ( entity_def SEMI )
                    {
                    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:49:3: ( entity_def SEMI )
                    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:49:4: entity_def SEMI
                    {
                    pushFollow(FOLLOW_entity_def_in_schema_def111);
                    entity_def6=entity_def();

                    state._fsp--;

                    stream_entity_def.add(entity_def6.getTree());

                    SEMI7=(Token)match(input,SEMI,FOLLOW_SEMI_in_schema_def113);  
                    stream_SEMI.add(SEMI7);


                    }


                    // AST REWRITE
                    // elements: entity_def
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 49:21: -> entity_def
                    {
                        adaptor.addChild(root_0, stream_entity_def.nextTree());

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:50:3: ( dom_def SEMI )
                    {
                    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:50:3: ( dom_def SEMI )
                    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:50:4: dom_def SEMI
                    {
                    pushFollow(FOLLOW_dom_def_in_schema_def123);
                    dom_def8=dom_def();

                    state._fsp--;

                    stream_dom_def.add(dom_def8.getTree());

                    SEMI9=(Token)match(input,SEMI,FOLLOW_SEMI_in_schema_def125);  
                    stream_SEMI.add(SEMI9);


                    }


                    // AST REWRITE
                    // elements: dom_def
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 50:18: -> dom_def
                    {
                        adaptor.addChild(root_0, stream_dom_def.nextTree());

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:51:3: ( elem_def SEMI )
                    {
                    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:51:3: ( elem_def SEMI )
                    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:51:4: elem_def SEMI
                    {
                    pushFollow(FOLLOW_elem_def_in_schema_def135);
                    elem_def10=elem_def();

                    state._fsp--;

                    stream_elem_def.add(elem_def10.getTree());

                    SEMI11=(Token)match(input,SEMI,FOLLOW_SEMI_in_schema_def137);  
                    stream_SEMI.add(SEMI11);


                    }


                    // AST REWRITE
                    // elements: elem_def
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 51:19: -> elem_def
                    {
                        adaptor.addChild(root_0, stream_elem_def.nextTree());

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 4 :
                    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:52:3: ( link_def SEMI )
                    {
                    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:52:3: ( link_def SEMI )
                    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:52:4: link_def SEMI
                    {
                    pushFollow(FOLLOW_link_def_in_schema_def147);
                    link_def12=link_def();

                    state._fsp--;

                    stream_link_def.add(link_def12.getTree());

                    SEMI13=(Token)match(input,SEMI,FOLLOW_SEMI_in_schema_def149);  
                    stream_SEMI.add(SEMI13);


                    }


                    // AST REWRITE
                    // elements: link_def
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 52:19: -> link_def
                    {
                        adaptor.addChild(root_0, stream_link_def.nextTree());

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {

            		System.out.println(SchemaLangUtil.getErrorMessage("schema_def"));
            		reportError(re);
            		consumeUntil(input, SEMI); // throw away all until ';'
            		input.consume(); // eat the ';'
            	
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "schema_def"


    public static class link_def_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "link_def"
    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:61:1: link_def : LINK id= ID (dir= FROM |dir= BETWEEN ) left_side= ID (left_card= ONE |left_card= MANY ) ( TO | AND ) right_side= ID (right_card= ONE |right_card= MANY ) -> ^( LINK $id $dir $left_side $left_card $right_side $right_card) ;
    public final SchemaLangParser.link_def_return link_def() throws RecognitionException {
        SchemaLangParser.link_def_return retval = new SchemaLangParser.link_def_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token id=null;
        Token dir=null;
        Token left_side=null;
        Token left_card=null;
        Token right_side=null;
        Token right_card=null;
        Token LINK14=null;
        Token TO15=null;
        Token AND16=null;

        Object id_tree=null;
        Object dir_tree=null;
        Object left_side_tree=null;
        Object left_card_tree=null;
        Object right_side_tree=null;
        Object right_card_tree=null;
        Object LINK14_tree=null;
        Object TO15_tree=null;
        Object AND16_tree=null;
        RewriteRuleTokenStream stream_ONE=new RewriteRuleTokenStream(adaptor,"token ONE");
        RewriteRuleTokenStream stream_LINK=new RewriteRuleTokenStream(adaptor,"token LINK");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_FROM=new RewriteRuleTokenStream(adaptor,"token FROM");
        RewriteRuleTokenStream stream_TO=new RewriteRuleTokenStream(adaptor,"token TO");
        RewriteRuleTokenStream stream_AND=new RewriteRuleTokenStream(adaptor,"token AND");
        RewriteRuleTokenStream stream_BETWEEN=new RewriteRuleTokenStream(adaptor,"token BETWEEN");
        RewriteRuleTokenStream stream_MANY=new RewriteRuleTokenStream(adaptor,"token MANY");

        try {
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:61:9: ( LINK id= ID (dir= FROM |dir= BETWEEN ) left_side= ID (left_card= ONE |left_card= MANY ) ( TO | AND ) right_side= ID (right_card= ONE |right_card= MANY ) -> ^( LINK $id $dir $left_side $left_card $right_side $right_card) )
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:62:2: LINK id= ID (dir= FROM |dir= BETWEEN ) left_side= ID (left_card= ONE |left_card= MANY ) ( TO | AND ) right_side= ID (right_card= ONE |right_card= MANY )
            {
            LINK14=(Token)match(input,LINK,FOLLOW_LINK_in_link_def170);  
            stream_LINK.add(LINK14);


            id=(Token)match(input,ID,FOLLOW_ID_in_link_def174);  
            stream_ID.add(id);


            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:62:13: (dir= FROM |dir= BETWEEN )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==FROM) ) {
                alt4=1;
            }
            else if ( (LA4_0==BETWEEN) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:62:14: dir= FROM
                    {
                    dir=(Token)match(input,FROM,FOLLOW_FROM_in_link_def179);  
                    stream_FROM.add(dir);


                    }
                    break;
                case 2 :
                    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:62:23: dir= BETWEEN
                    {
                    dir=(Token)match(input,BETWEEN,FOLLOW_BETWEEN_in_link_def183);  
                    stream_BETWEEN.add(dir);


                    }
                    break;

            }


            left_side=(Token)match(input,ID,FOLLOW_ID_in_link_def188);  
            stream_ID.add(left_side);


            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:62:49: (left_card= ONE |left_card= MANY )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==ONE) ) {
                alt5=1;
            }
            else if ( (LA5_0==MANY) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:62:50: left_card= ONE
                    {
                    left_card=(Token)match(input,ONE,FOLLOW_ONE_in_link_def193);  
                    stream_ONE.add(left_card);


                    }
                    break;
                case 2 :
                    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:62:64: left_card= MANY
                    {
                    left_card=(Token)match(input,MANY,FOLLOW_MANY_in_link_def197);  
                    stream_MANY.add(left_card);


                    }
                    break;

            }


            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:63:2: ( TO | AND )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==TO) ) {
                alt6=1;
            }
            else if ( (LA6_0==AND) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }
            switch (alt6) {
                case 1 :
                    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:63:3: TO
                    {
                    TO15=(Token)match(input,TO,FOLLOW_TO_in_link_def203);  
                    stream_TO.add(TO15);


                    }
                    break;
                case 2 :
                    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:63:6: AND
                    {
                    AND16=(Token)match(input,AND,FOLLOW_AND_in_link_def205);  
                    stream_AND.add(AND16);


                    }
                    break;

            }


            right_side=(Token)match(input,ID,FOLLOW_ID_in_link_def210);  
            stream_ID.add(right_side);


            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:63:25: (right_card= ONE |right_card= MANY )
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
                    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:63:26: right_card= ONE
                    {
                    right_card=(Token)match(input,ONE,FOLLOW_ONE_in_link_def215);  
                    stream_ONE.add(right_card);


                    }
                    break;
                case 2 :
                    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:63:41: right_card= MANY
                    {
                    right_card=(Token)match(input,MANY,FOLLOW_MANY_in_link_def219);  
                    stream_MANY.add(right_card);


                    }
                    break;

            }


            // AST REWRITE
            // elements: left_card, dir, right_side, id, right_card, left_side, LINK
            // token labels: right_card, id, left_side, dir, left_card, right_side
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_right_card=new RewriteRuleTokenStream(adaptor,"token right_card",right_card);
            RewriteRuleTokenStream stream_id=new RewriteRuleTokenStream(adaptor,"token id",id);
            RewriteRuleTokenStream stream_left_side=new RewriteRuleTokenStream(adaptor,"token left_side",left_side);
            RewriteRuleTokenStream stream_dir=new RewriteRuleTokenStream(adaptor,"token dir",dir);
            RewriteRuleTokenStream stream_left_card=new RewriteRuleTokenStream(adaptor,"token left_card",left_card);
            RewriteRuleTokenStream stream_right_side=new RewriteRuleTokenStream(adaptor,"token right_side",right_side);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 63:58: -> ^( LINK $id $dir $left_side $left_card $right_side $right_card)
            {
                // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:63:61: ^( LINK $id $dir $left_side $left_card $right_side $right_card)
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_LINK.nextNode()
                , root_1);

                adaptor.addChild(root_1, stream_id.nextNode());

                adaptor.addChild(root_1, stream_dir.nextNode());

                adaptor.addChild(root_1, stream_left_side.nextNode());

                adaptor.addChild(root_1, stream_left_card.nextNode());

                adaptor.addChild(root_1, stream_right_side.nextNode());

                adaptor.addChild(root_1, stream_right_card.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "link_def"


    public static class set_property_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "set_property"
    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:66:1: set_property : SET ID '=' STRING SEMI -> ^( SET ID STRING ) ;
    public final SchemaLangParser.set_property_return set_property() throws RecognitionException {
        SchemaLangParser.set_property_return retval = new SchemaLangParser.set_property_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token SET17=null;
        Token ID18=null;
        Token char_literal19=null;
        Token STRING20=null;
        Token SEMI21=null;

        Object SET17_tree=null;
        Object ID18_tree=null;
        Object char_literal19_tree=null;
        Object STRING20_tree=null;
        Object SEMI21_tree=null;
        RewriteRuleTokenStream stream_SET=new RewriteRuleTokenStream(adaptor,"token SET");
        RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");

        try {
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:66:13: ( SET ID '=' STRING SEMI -> ^( SET ID STRING ) )
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:67:2: SET ID '=' STRING SEMI
            {
            SET17=(Token)match(input,SET,FOLLOW_SET_in_set_property254);  
            stream_SET.add(SET17);


            ID18=(Token)match(input,ID,FOLLOW_ID_in_set_property256);  
            stream_ID.add(ID18);


            char_literal19=(Token)match(input,42,FOLLOW_42_in_set_property258);  
            stream_42.add(char_literal19);


            STRING20=(Token)match(input,STRING,FOLLOW_STRING_in_set_property260);  
            stream_STRING.add(STRING20);


            SEMI21=(Token)match(input,SEMI,FOLLOW_SEMI_in_set_property262);  
            stream_SEMI.add(SEMI21);


            // AST REWRITE
            // elements: SET, STRING, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 67:25: -> ^( SET ID STRING )
            {
                // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:67:28: ^( SET ID STRING )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_SET.nextNode()
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_STRING.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {

            		System.out.println(SchemaLangUtil.getErrorMessage("set_property"));
            		reportError(re);
            		consumeUntil(input, SEMI); // throw away all until ';'
            		input.consume(); // eat the ';'
            	
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "set_property"


    public static class entity_def_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "entity_def"
    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:77:1: entity_def : ENTITY id= ID '(' eu+= elem_use ( ',' eu+= elem_use )* ')' -> ^( ENTITY ID ( $eu)+ ) ;
    public final SchemaLangParser.entity_def_return entity_def() throws RecognitionException {
        SchemaLangParser.entity_def_return retval = new SchemaLangParser.entity_def_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token id=null;
        Token ENTITY22=null;
        Token char_literal23=null;
        Token char_literal24=null;
        Token char_literal25=null;
        List list_eu=null;
        RuleReturnScope eu = null;
        Object id_tree=null;
        Object ENTITY22_tree=null;
        Object char_literal23_tree=null;
        Object char_literal24_tree=null;
        Object char_literal25_tree=null;
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
        RewriteRuleTokenStream stream_ENTITY=new RewriteRuleTokenStream(adaptor,"token ENTITY");
        RewriteRuleSubtreeStream stream_elem_use=new RewriteRuleSubtreeStream(adaptor,"rule elem_use");
        try {
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:77:11: ( ENTITY id= ID '(' eu+= elem_use ( ',' eu+= elem_use )* ')' -> ^( ENTITY ID ( $eu)+ ) )
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:78:2: ENTITY id= ID '(' eu+= elem_use ( ',' eu+= elem_use )* ')'
            {
            ENTITY22=(Token)match(input,ENTITY,FOLLOW_ENTITY_in_entity_def292);  
            stream_ENTITY.add(ENTITY22);


            id=(Token)match(input,ID,FOLLOW_ID_in_entity_def296);  
            stream_ID.add(id);


            currentTable = (id!=null?id.getText():null);

            char_literal23=(Token)match(input,39,FOLLOW_39_in_entity_def301);  
            stream_39.add(char_literal23);


            pushFollow(FOLLOW_elem_use_in_entity_def307);
            eu=elem_use();

            state._fsp--;

            stream_elem_use.add(eu.getTree());
            if (list_eu==null) list_eu=new ArrayList();
            list_eu.add(eu.getTree());


            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:79:16: ( ',' eu+= elem_use )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==41) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:79:17: ',' eu+= elem_use
            	    {
            	    char_literal24=(Token)match(input,41,FOLLOW_41_in_entity_def310);  
            	    stream_41.add(char_literal24);


            	    pushFollow(FOLLOW_elem_use_in_entity_def314);
            	    eu=elem_use();

            	    state._fsp--;

            	    stream_elem_use.add(eu.getTree());
            	    if (list_eu==null) list_eu=new ArrayList();
            	    list_eu.add(eu.getTree());


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            char_literal25=(Token)match(input,40,FOLLOW_40_in_entity_def319);  
            stream_40.add(char_literal25);


            // AST REWRITE
            // elements: ENTITY, ID, eu
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: eu
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_eu=new RewriteRuleSubtreeStream(adaptor,"token eu",list_eu);
            root_0 = (Object)adaptor.nil();
            // 80:6: -> ^( ENTITY ID ( $eu)+ )
            {
                // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:80:9: ^( ENTITY ID ( $eu)+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_ENTITY.nextNode()
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                if ( !(stream_eu.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_eu.hasNext() ) {
                    adaptor.addChild(root_1, stream_eu.nextTree());

                }
                stream_eu.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {

            		System.out.println(SchemaLangUtil.getErrorMessage("entity_def"));
            		reportError(re);
            		consumeUntil(input, SEMI); // throw away all until ';'
            		input.consume(); // eat the ';'
            	
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "entity_def"


    public static class dom_def_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "dom_def"
    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:89:1: dom_def : DOMAIN ID TYPE (t= TYPE_STRING |t= TYPE_INT |t= TYPE_NUMBER |t= TYPE_TIMESTAMP |t= TYPE_DATE ) ( LENGTH l= INT ( PRECISION p= INT )? )? -> ^( DOMAIN ID $t ( LENGTH $l ( PRECISION $p)? )? ) ;
    public final SchemaLangParser.dom_def_return dom_def() throws RecognitionException {
        SchemaLangParser.dom_def_return retval = new SchemaLangParser.dom_def_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token t=null;
        Token l=null;
        Token p=null;
        Token DOMAIN26=null;
        Token ID27=null;
        Token TYPE28=null;
        Token LENGTH29=null;
        Token PRECISION30=null;

        Object t_tree=null;
        Object l_tree=null;
        Object p_tree=null;
        Object DOMAIN26_tree=null;
        Object ID27_tree=null;
        Object TYPE28_tree=null;
        Object LENGTH29_tree=null;
        Object PRECISION30_tree=null;
        RewriteRuleTokenStream stream_TYPE_TIMESTAMP=new RewriteRuleTokenStream(adaptor,"token TYPE_TIMESTAMP");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_TYPE_NUMBER=new RewriteRuleTokenStream(adaptor,"token TYPE_NUMBER");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_TYPE_STRING=new RewriteRuleTokenStream(adaptor,"token TYPE_STRING");
        RewriteRuleTokenStream stream_TYPE_INT=new RewriteRuleTokenStream(adaptor,"token TYPE_INT");
        RewriteRuleTokenStream stream_TYPE_DATE=new RewriteRuleTokenStream(adaptor,"token TYPE_DATE");
        RewriteRuleTokenStream stream_PRECISION=new RewriteRuleTokenStream(adaptor,"token PRECISION");
        RewriteRuleTokenStream stream_DOMAIN=new RewriteRuleTokenStream(adaptor,"token DOMAIN");
        RewriteRuleTokenStream stream_LENGTH=new RewriteRuleTokenStream(adaptor,"token LENGTH");
        RewriteRuleTokenStream stream_TYPE=new RewriteRuleTokenStream(adaptor,"token TYPE");

        try {
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:89:8: ( DOMAIN ID TYPE (t= TYPE_STRING |t= TYPE_INT |t= TYPE_NUMBER |t= TYPE_TIMESTAMP |t= TYPE_DATE ) ( LENGTH l= INT ( PRECISION p= INT )? )? -> ^( DOMAIN ID $t ( LENGTH $l ( PRECISION $p)? )? ) )
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:90:2: DOMAIN ID TYPE (t= TYPE_STRING |t= TYPE_INT |t= TYPE_NUMBER |t= TYPE_TIMESTAMP |t= TYPE_DATE ) ( LENGTH l= INT ( PRECISION p= INT )? )?
            {
            DOMAIN26=(Token)match(input,DOMAIN,FOLLOW_DOMAIN_in_dom_def350);  
            stream_DOMAIN.add(DOMAIN26);


            ID27=(Token)match(input,ID,FOLLOW_ID_in_dom_def352);  
            stream_ID.add(ID27);


            TYPE28=(Token)match(input,TYPE,FOLLOW_TYPE_in_dom_def354);  
            stream_TYPE.add(TYPE28);


            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:90:17: (t= TYPE_STRING |t= TYPE_INT |t= TYPE_NUMBER |t= TYPE_TIMESTAMP |t= TYPE_DATE )
            int alt9=5;
            switch ( input.LA(1) ) {
            case TYPE_STRING:
                {
                alt9=1;
                }
                break;
            case TYPE_INT:
                {
                alt9=2;
                }
                break;
            case TYPE_NUMBER:
                {
                alt9=3;
                }
                break;
            case TYPE_TIMESTAMP:
                {
                alt9=4;
                }
                break;
            case TYPE_DATE:
                {
                alt9=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }

            switch (alt9) {
                case 1 :
                    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:90:18: t= TYPE_STRING
                    {
                    t=(Token)match(input,TYPE_STRING,FOLLOW_TYPE_STRING_in_dom_def359);  
                    stream_TYPE_STRING.add(t);


                    }
                    break;
                case 2 :
                    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:90:34: t= TYPE_INT
                    {
                    t=(Token)match(input,TYPE_INT,FOLLOW_TYPE_INT_in_dom_def365);  
                    stream_TYPE_INT.add(t);


                    }
                    break;
                case 3 :
                    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:90:47: t= TYPE_NUMBER
                    {
                    t=(Token)match(input,TYPE_NUMBER,FOLLOW_TYPE_NUMBER_in_dom_def371);  
                    stream_TYPE_NUMBER.add(t);


                    }
                    break;
                case 4 :
                    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:90:63: t= TYPE_TIMESTAMP
                    {
                    t=(Token)match(input,TYPE_TIMESTAMP,FOLLOW_TYPE_TIMESTAMP_in_dom_def377);  
                    stream_TYPE_TIMESTAMP.add(t);


                    }
                    break;
                case 5 :
                    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:90:82: t= TYPE_DATE
                    {
                    t=(Token)match(input,TYPE_DATE,FOLLOW_TYPE_DATE_in_dom_def383);  
                    stream_TYPE_DATE.add(t);


                    }
                    break;

            }


            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:90:94: ( LENGTH l= INT ( PRECISION p= INT )? )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==LENGTH) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:90:95: LENGTH l= INT ( PRECISION p= INT )?
                    {
                    LENGTH29=(Token)match(input,LENGTH,FOLLOW_LENGTH_in_dom_def386);  
                    stream_LENGTH.add(LENGTH29);


                    l=(Token)match(input,INT,FOLLOW_INT_in_dom_def390);  
                    stream_INT.add(l);


                    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:90:108: ( PRECISION p= INT )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==PRECISION) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:90:109: PRECISION p= INT
                            {
                            PRECISION30=(Token)match(input,PRECISION,FOLLOW_PRECISION_in_dom_def393);  
                            stream_PRECISION.add(PRECISION30);


                            p=(Token)match(input,INT,FOLLOW_INT_in_dom_def397);  
                            stream_INT.add(p);


                            }
                            break;

                    }


                    }
                    break;

            }


            // AST REWRITE
            // elements: l, p, t, ID, DOMAIN, LENGTH, PRECISION
            // token labels: t, p, l
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_t=new RewriteRuleTokenStream(adaptor,"token t",t);
            RewriteRuleTokenStream stream_p=new RewriteRuleTokenStream(adaptor,"token p",p);
            RewriteRuleTokenStream stream_l=new RewriteRuleTokenStream(adaptor,"token l",l);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 91:2: -> ^( DOMAIN ID $t ( LENGTH $l ( PRECISION $p)? )? )
            {
                // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:91:5: ^( DOMAIN ID $t ( LENGTH $l ( PRECISION $p)? )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_DOMAIN.nextNode()
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                adaptor.addChild(root_1, stream_t.nextNode());

                // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:91:21: ( LENGTH $l ( PRECISION $p)? )?
                if ( stream_l.hasNext()||stream_p.hasNext()||stream_LENGTH.hasNext()||stream_PRECISION.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_LENGTH.nextNode()
                    );

                    adaptor.addChild(root_1, stream_l.nextNode());

                    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:91:32: ( PRECISION $p)?
                    if ( stream_p.hasNext()||stream_PRECISION.hasNext() ) {
                        adaptor.addChild(root_1, 
                        stream_PRECISION.nextNode()
                        );

                        adaptor.addChild(root_1, stream_p.nextNode());

                    }
                    stream_p.reset();
                    stream_PRECISION.reset();

                }
                stream_l.reset();
                stream_p.reset();
                stream_LENGTH.reset();
                stream_PRECISION.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {

            		System.out.println(SchemaLangUtil.getErrorMessage("dom_def"));
            		reportError(re);
            		consumeUntil(input, SEMI); // throw away all until ';'
            		input.consume(); // eat the ';'
            	
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "dom_def"


    public static class dom_use_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "dom_use"
    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:99:1: dom_use : ( dom_def -> dom_def | DOMAIN ID -> ^( DOMAIN ID ) );
    public final SchemaLangParser.dom_use_return dom_use() throws RecognitionException {
        SchemaLangParser.dom_use_return retval = new SchemaLangParser.dom_use_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DOMAIN32=null;
        Token ID33=null;
        SchemaLangParser.dom_def_return dom_def31 =null;


        Object DOMAIN32_tree=null;
        Object ID33_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_DOMAIN=new RewriteRuleTokenStream(adaptor,"token DOMAIN");
        RewriteRuleSubtreeStream stream_dom_def=new RewriteRuleSubtreeStream(adaptor,"rule dom_def");
        try {
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:99:8: ( dom_def -> dom_def | DOMAIN ID -> ^( DOMAIN ID ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==DOMAIN) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==ID) ) {
                    int LA12_2 = input.LA(3);

                    if ( (LA12_2==TYPE) ) {
                        alt12=1;
                    }
                    else if ( (LA12_2==SEMI||(LA12_2 >= 40 && LA12_2 <= 41)) ) {
                        alt12=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 2, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;

            }
            switch (alt12) {
                case 1 :
                    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:100:2: dom_def
                    {
                    pushFollow(FOLLOW_dom_def_in_dom_use448);
                    dom_def31=dom_def();

                    state._fsp--;

                    stream_dom_def.add(dom_def31.getTree());

                    // AST REWRITE
                    // elements: dom_def
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 100:10: -> dom_def
                    {
                        adaptor.addChild(root_0, stream_dom_def.nextTree());

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:101:2: DOMAIN ID
                    {
                    DOMAIN32=(Token)match(input,DOMAIN,FOLLOW_DOMAIN_in_dom_use456);  
                    stream_DOMAIN.add(DOMAIN32);


                    ID33=(Token)match(input,ID,FOLLOW_ID_in_dom_use458);  
                    stream_ID.add(ID33);


                    // AST REWRITE
                    // elements: ID, DOMAIN
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 101:12: -> ^( DOMAIN ID )
                    {
                        // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:101:15: ^( DOMAIN ID )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_DOMAIN.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {

            		System.out.println(SchemaLangUtil.getDomainUsageError());
            		reportError(re);
            		consumeUntil(input, SEMI); // throw away all until ';'
            		input.consume(); // eat the ';'
            	
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "dom_use"


    public static class elem_def_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "elem_def"
    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:110:1: elem_def : ELEMENT ID ( STEXT STRING )? ( MTEXT STRING )? ( LTEXT STRING )? dom_use -> ^( ELEMENT ID ( STEXT STRING )? ( MTEXT STRING )? ( LTEXT STRING )? dom_use ) ;
    public final SchemaLangParser.elem_def_return elem_def() throws RecognitionException {
        SchemaLangParser.elem_def_return retval = new SchemaLangParser.elem_def_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ELEMENT34=null;
        Token ID35=null;
        Token STEXT36=null;
        Token STRING37=null;
        Token MTEXT38=null;
        Token STRING39=null;
        Token LTEXT40=null;
        Token STRING41=null;
        SchemaLangParser.dom_use_return dom_use42 =null;


        Object ELEMENT34_tree=null;
        Object ID35_tree=null;
        Object STEXT36_tree=null;
        Object STRING37_tree=null;
        Object MTEXT38_tree=null;
        Object STRING39_tree=null;
        Object LTEXT40_tree=null;
        Object STRING41_tree=null;
        RewriteRuleTokenStream stream_ELEMENT=new RewriteRuleTokenStream(adaptor,"token ELEMENT");
        RewriteRuleTokenStream stream_STEXT=new RewriteRuleTokenStream(adaptor,"token STEXT");
        RewriteRuleTokenStream stream_MTEXT=new RewriteRuleTokenStream(adaptor,"token MTEXT");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");
        RewriteRuleTokenStream stream_LTEXT=new RewriteRuleTokenStream(adaptor,"token LTEXT");
        RewriteRuleSubtreeStream stream_dom_use=new RewriteRuleSubtreeStream(adaptor,"rule dom_use");
        try {
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:110:9: ( ELEMENT ID ( STEXT STRING )? ( MTEXT STRING )? ( LTEXT STRING )? dom_use -> ^( ELEMENT ID ( STEXT STRING )? ( MTEXT STRING )? ( LTEXT STRING )? dom_use ) )
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:111:2: ELEMENT ID ( STEXT STRING )? ( MTEXT STRING )? ( LTEXT STRING )? dom_use
            {
            ELEMENT34=(Token)match(input,ELEMENT,FOLLOW_ELEMENT_in_elem_def485);  
            stream_ELEMENT.add(ELEMENT34);


            ID35=(Token)match(input,ID,FOLLOW_ID_in_elem_def487);  
            stream_ID.add(ID35);


            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:111:13: ( STEXT STRING )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==STEXT) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:111:14: STEXT STRING
                    {
                    STEXT36=(Token)match(input,STEXT,FOLLOW_STEXT_in_elem_def490);  
                    stream_STEXT.add(STEXT36);


                    STRING37=(Token)match(input,STRING,FOLLOW_STRING_in_elem_def492);  
                    stream_STRING.add(STRING37);


                    }
                    break;

            }


            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:111:29: ( MTEXT STRING )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==MTEXT) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:111:30: MTEXT STRING
                    {
                    MTEXT38=(Token)match(input,MTEXT,FOLLOW_MTEXT_in_elem_def497);  
                    stream_MTEXT.add(MTEXT38);


                    STRING39=(Token)match(input,STRING,FOLLOW_STRING_in_elem_def499);  
                    stream_STRING.add(STRING39);


                    }
                    break;

            }


            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:111:45: ( LTEXT STRING )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==LTEXT) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:111:46: LTEXT STRING
                    {
                    LTEXT40=(Token)match(input,LTEXT,FOLLOW_LTEXT_in_elem_def504);  
                    stream_LTEXT.add(LTEXT40);


                    STRING41=(Token)match(input,STRING,FOLLOW_STRING_in_elem_def506);  
                    stream_STRING.add(STRING41);


                    }
                    break;

            }


            pushFollow(FOLLOW_dom_use_in_elem_def510);
            dom_use42=dom_use();

            state._fsp--;

            stream_dom_use.add(dom_use42.getTree());

            // AST REWRITE
            // elements: STEXT, STRING, STRING, ID, dom_use, STRING, ELEMENT, MTEXT, LTEXT
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 112:2: -> ^( ELEMENT ID ( STEXT STRING )? ( MTEXT STRING )? ( LTEXT STRING )? dom_use )
            {
                // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:112:5: ^( ELEMENT ID ( STEXT STRING )? ( MTEXT STRING )? ( LTEXT STRING )? dom_use )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_ELEMENT.nextNode()
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:112:18: ( STEXT STRING )?
                if ( stream_STEXT.hasNext()||stream_STRING.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_STEXT.nextNode()
                    );

                    adaptor.addChild(root_1, 
                    stream_STRING.nextNode()
                    );

                }
                stream_STEXT.reset();
                stream_STRING.reset();

                // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:112:34: ( MTEXT STRING )?
                if ( stream_STRING.hasNext()||stream_MTEXT.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_MTEXT.nextNode()
                    );

                    adaptor.addChild(root_1, 
                    stream_STRING.nextNode()
                    );

                }
                stream_STRING.reset();
                stream_MTEXT.reset();

                // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:112:50: ( LTEXT STRING )?
                if ( stream_STRING.hasNext()||stream_LTEXT.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_LTEXT.nextNode()
                    );

                    adaptor.addChild(root_1, 
                    stream_STRING.nextNode()
                    );

                }
                stream_STRING.reset();
                stream_LTEXT.reset();

                adaptor.addChild(root_1, stream_dom_use.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {

            		System.out.println(SchemaLangUtil.getErrorMessage("elem_def"));
            		reportError(re);
            		consumeUntil(input, SEMI); // throw away all until ';'
            		input.consume(); // eat the ';'
            	
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "elem_def"


    public static class key_elem_def_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "key_elem_def"
    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:121:1: key_elem_def : ( KEY ed= elem_def -> ^( KEY $ed) | KEY ne= named_elem -> ^( KEY $ne) );
    public final SchemaLangParser.key_elem_def_return key_elem_def() throws RecognitionException {
        SchemaLangParser.key_elem_def_return retval = new SchemaLangParser.key_elem_def_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token KEY43=null;
        Token KEY44=null;
        SchemaLangParser.elem_def_return ed =null;

        SchemaLangParser.named_elem_return ne =null;


        Object KEY43_tree=null;
        Object KEY44_tree=null;
        RewriteRuleTokenStream stream_KEY=new RewriteRuleTokenStream(adaptor,"token KEY");
        RewriteRuleSubtreeStream stream_named_elem=new RewriteRuleSubtreeStream(adaptor,"rule named_elem");
        RewriteRuleSubtreeStream stream_elem_def=new RewriteRuleSubtreeStream(adaptor,"rule elem_def");
        try {
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:121:13: ( KEY ed= elem_def -> ^( KEY $ed) | KEY ne= named_elem -> ^( KEY $ne) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==KEY) ) {
                int LA16_1 = input.LA(2);

                if ( (LA16_1==ELEMENT) ) {
                    int LA16_2 = input.LA(3);

                    if ( (LA16_2==ID) ) {
                        int LA16_3 = input.LA(4);

                        if ( (LA16_3==DOMAIN||LA16_3==LTEXT||LA16_3==MTEXT||LA16_3==STEXT) ) {
                            alt16=1;
                        }
                        else if ( ((LA16_3 >= 40 && LA16_3 <= 41)) ) {
                            alt16=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 16, 3, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 16, 2, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;

            }
            switch (alt16) {
                case 1 :
                    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:122:2: KEY ed= elem_def
                    {
                    KEY43=(Token)match(input,KEY,FOLLOW_KEY_in_key_elem_def561);  
                    stream_KEY.add(KEY43);


                    pushFollow(FOLLOW_elem_def_in_key_elem_def565);
                    ed=elem_def();

                    state._fsp--;

                    stream_elem_def.add(ed.getTree());

                    // AST REWRITE
                    // elements: ed, KEY
                    // token labels: 
                    // rule labels: retval, ed
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_ed=new RewriteRuleSubtreeStream(adaptor,"rule ed",ed!=null?ed.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 122:18: -> ^( KEY $ed)
                    {
                        // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:122:21: ^( KEY $ed)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_KEY.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_ed.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:123:2: KEY ne= named_elem
                    {
                    KEY44=(Token)match(input,KEY,FOLLOW_KEY_in_key_elem_def578);  
                    stream_KEY.add(KEY44);


                    pushFollow(FOLLOW_named_elem_in_key_elem_def582);
                    ne=named_elem();

                    state._fsp--;

                    stream_named_elem.add(ne.getTree());

                    // AST REWRITE
                    // elements: KEY, ne
                    // token labels: 
                    // rule labels: retval, ne
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_ne=new RewriteRuleSubtreeStream(adaptor,"rule ne",ne!=null?ne.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 123:20: -> ^( KEY $ne)
                    {
                        // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:123:23: ^( KEY $ne)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_KEY.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_ne.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "key_elem_def"


    public static class named_elem_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "named_elem"
    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:126:1: named_elem : ELEMENT ID -> ^( ELEMENT ID ) ;
    public final SchemaLangParser.named_elem_return named_elem() throws RecognitionException {
        SchemaLangParser.named_elem_return retval = new SchemaLangParser.named_elem_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ELEMENT45=null;
        Token ID46=null;

        Object ELEMENT45_tree=null;
        Object ID46_tree=null;
        RewriteRuleTokenStream stream_ELEMENT=new RewriteRuleTokenStream(adaptor,"token ELEMENT");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:126:11: ( ELEMENT ID -> ^( ELEMENT ID ) )
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:127:2: ELEMENT ID
            {
            ELEMENT45=(Token)match(input,ELEMENT,FOLLOW_ELEMENT_in_named_elem602);  
            stream_ELEMENT.add(ELEMENT45);


            ID46=(Token)match(input,ID,FOLLOW_ID_in_named_elem604);  
            stream_ID.add(ID46);


            // AST REWRITE
            // elements: ELEMENT, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 127:13: -> ^( ELEMENT ID )
            {
                // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:127:16: ^( ELEMENT ID )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_ELEMENT.nextNode()
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "named_elem"


    public static class elem_use_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "elem_use"
    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:130:1: elem_use : ( elem_def -> elem_def | key_elem_def -> key_elem_def | named_elem -> named_elem );
    public final SchemaLangParser.elem_use_return elem_use() throws RecognitionException {
        SchemaLangParser.elem_use_return retval = new SchemaLangParser.elem_use_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        SchemaLangParser.elem_def_return elem_def47 =null;

        SchemaLangParser.key_elem_def_return key_elem_def48 =null;

        SchemaLangParser.named_elem_return named_elem49 =null;


        RewriteRuleSubtreeStream stream_named_elem=new RewriteRuleSubtreeStream(adaptor,"rule named_elem");
        RewriteRuleSubtreeStream stream_key_elem_def=new RewriteRuleSubtreeStream(adaptor,"rule key_elem_def");
        RewriteRuleSubtreeStream stream_elem_def=new RewriteRuleSubtreeStream(adaptor,"rule elem_def");
        try {
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:130:9: ( elem_def -> elem_def | key_elem_def -> key_elem_def | named_elem -> named_elem )
            int alt17=3;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==ELEMENT) ) {
                int LA17_1 = input.LA(2);

                if ( (LA17_1==ID) ) {
                    int LA17_3 = input.LA(3);

                    if ( (LA17_3==DOMAIN||LA17_3==LTEXT||LA17_3==MTEXT||LA17_3==STEXT) ) {
                        alt17=1;
                    }
                    else if ( ((LA17_3 >= 40 && LA17_3 <= 41)) ) {
                        alt17=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 17, 3, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA17_0==KEY) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;

            }
            switch (alt17) {
                case 1 :
                    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:131:2: elem_def
                    {
                    pushFollow(FOLLOW_elem_def_in_elem_use623);
                    elem_def47=elem_def();

                    state._fsp--;

                    stream_elem_def.add(elem_def47.getTree());

                    // AST REWRITE
                    // elements: elem_def
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 131:11: -> elem_def
                    {
                        adaptor.addChild(root_0, stream_elem_def.nextTree());

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:132:2: key_elem_def
                    {
                    pushFollow(FOLLOW_key_elem_def_in_elem_use632);
                    key_elem_def48=key_elem_def();

                    state._fsp--;

                    stream_key_elem_def.add(key_elem_def48.getTree());

                    // AST REWRITE
                    // elements: key_elem_def
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 132:15: -> key_elem_def
                    {
                        adaptor.addChild(root_0, stream_key_elem_def.nextTree());

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:133:2: named_elem
                    {
                    pushFollow(FOLLOW_named_elem_in_elem_use641);
                    named_elem49=named_elem();

                    state._fsp--;

                    stream_named_elem.add(named_elem49.getTree());

                    // AST REWRITE
                    // elements: named_elem
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 133:13: -> named_elem
                    {
                        adaptor.addChild(root_0, stream_named_elem.nextTree());

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "elem_use"

    // Delegated rules


 

    public static final BitSet FOLLOW_SCHEMA_in_schema_file64 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ID_in_schema_file66 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_SEMI_in_schema_file68 = new BitSet(new long[]{0x0000000008010682L});
    public static final BitSet FOLLOW_set_property_in_schema_file73 = new BitSet(new long[]{0x0000000008010682L});
    public static final BitSet FOLLOW_schema_def_in_schema_file77 = new BitSet(new long[]{0x0000000000010682L});
    public static final BitSet FOLLOW_entity_def_in_schema_def111 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_SEMI_in_schema_def113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dom_def_in_schema_def123 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_SEMI_in_schema_def125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_elem_def_in_schema_def135 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_SEMI_in_schema_def137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_link_def_in_schema_def147 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_SEMI_in_schema_def149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LINK_in_link_def170 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ID_in_link_def174 = new BitSet(new long[]{0x0000000000000840L});
    public static final BitSet FOLLOW_FROM_in_link_def179 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_BETWEEN_in_link_def183 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ID_in_link_def188 = new BitSet(new long[]{0x0000000000880000L});
    public static final BitSet FOLLOW_ONE_in_link_def193 = new BitSet(new long[]{0x0000000080000010L});
    public static final BitSet FOLLOW_MANY_in_link_def197 = new BitSet(new long[]{0x0000000080000010L});
    public static final BitSet FOLLOW_TO_in_link_def203 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_AND_in_link_def205 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ID_in_link_def210 = new BitSet(new long[]{0x0000000000880000L});
    public static final BitSet FOLLOW_ONE_in_link_def215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MANY_in_link_def219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SET_in_set_property254 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ID_in_set_property256 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_set_property258 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_STRING_in_set_property260 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_SEMI_in_set_property262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENTITY_in_entity_def292 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ID_in_entity_def296 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_entity_def301 = new BitSet(new long[]{0x0000000000004200L});
    public static final BitSet FOLLOW_elem_use_in_entity_def307 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_41_in_entity_def310 = new BitSet(new long[]{0x0000000000004200L});
    public static final BitSet FOLLOW_elem_use_in_entity_def314 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_40_in_entity_def319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOMAIN_in_dom_def350 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ID_in_dom_def352 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_TYPE_in_dom_def354 = new BitSet(new long[]{0x0000003E00000000L});
    public static final BitSet FOLLOW_TYPE_STRING_in_dom_def359 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_TYPE_INT_in_dom_def365 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_TYPE_NUMBER_in_dom_def371 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_TYPE_TIMESTAMP_in_dom_def377 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_TYPE_DATE_in_dom_def383 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_LENGTH_in_dom_def386 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_INT_in_dom_def390 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_PRECISION_in_dom_def393 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_INT_in_dom_def397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dom_def_in_dom_use448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOMAIN_in_dom_use456 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ID_in_dom_use458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELEMENT_in_elem_def485 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ID_in_elem_def487 = new BitSet(new long[]{0x0000000020220080L});
    public static final BitSet FOLLOW_STEXT_in_elem_def490 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_STRING_in_elem_def492 = new BitSet(new long[]{0x0000000000220080L});
    public static final BitSet FOLLOW_MTEXT_in_elem_def497 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_STRING_in_elem_def499 = new BitSet(new long[]{0x0000000000020080L});
    public static final BitSet FOLLOW_LTEXT_in_elem_def504 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_STRING_in_elem_def506 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_dom_use_in_elem_def510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEY_in_key_elem_def561 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_elem_def_in_key_elem_def565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEY_in_key_elem_def578 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_named_elem_in_key_elem_def582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELEMENT_in_named_elem602 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ID_in_named_elem604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_elem_def_in_elem_use623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_key_elem_def_in_elem_use632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_named_elem_in_elem_use641 = new BitSet(new long[]{0x0000000000000002L});

}