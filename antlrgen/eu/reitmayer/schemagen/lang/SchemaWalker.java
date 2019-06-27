// $ANTLR 3.4 F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaWalker.g 2013-06-09 23:03:25

package eu.reitmayer.schemagen.lang;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class SchemaWalker extends TreeParser {
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


    public SchemaWalker(TreeNodeStream input) {
        this(input, new RecognizerSharedState());
    }
    public SchemaWalker(TreeNodeStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return SchemaWalker.tokenNames; }
    public String getGrammarFileName() { return "F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaWalker.g"; }


    	public Schema schema = new Schema();
    	public String currentEntity = "";


    public static class schema_file_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "schema_file"
    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaWalker.g:19:1: schema_file : ^( SCHEMA ID ( set_property )* ( schema_def )* ) ;
    public final SchemaWalker.schema_file_return schema_file() throws RecognitionException {
        SchemaWalker.schema_file_return retval = new SchemaWalker.schema_file_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree SCHEMA1=null;
        CommonTree ID2=null;
        SchemaWalker.set_property_return set_property3 =null;

        SchemaWalker.schema_def_return schema_def4 =null;


        CommonTree SCHEMA1_tree=null;
        CommonTree ID2_tree=null;

        try {
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaWalker.g:19:12: ( ^( SCHEMA ID ( set_property )* ( schema_def )* ) )
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaWalker.g:20:2: ^( SCHEMA ID ( set_property )* ( schema_def )* )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            SCHEMA1=(CommonTree)match(input,SCHEMA,FOLLOW_SCHEMA_in_schema_file65); 
            SCHEMA1_tree = (CommonTree)adaptor.dupNode(SCHEMA1);


            root_1 = (CommonTree)adaptor.becomeRoot(SCHEMA1_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            ID2=(CommonTree)match(input,ID,FOLLOW_ID_in_schema_file67); 
            ID2_tree = (CommonTree)adaptor.dupNode(ID2);


            adaptor.addChild(root_1, ID2_tree);


            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaWalker.g:20:14: ( set_property )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==SET) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaWalker.g:20:14: set_property
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_set_property_in_schema_file69);
            	    set_property3=set_property();

            	    state._fsp--;

            	    adaptor.addChild(root_1, set_property3.getTree());


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaWalker.g:20:28: ( schema_def )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==DOMAIN||(LA2_0 >= ELEMENT && LA2_0 <= ENTITY)||LA2_0==LINK) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaWalker.g:20:28: schema_def
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_schema_def_in_schema_file72);
            	    schema_def4=schema_def();

            	    state._fsp--;

            	    adaptor.addChild(root_1, schema_def4.getTree());


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            schema.setSchemaName((ID2!=null?ID2.getText():null));

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

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
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "schema_def"
    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaWalker.g:23:1: schema_def : ( entity_def | dom_def | elem_def | link_def );
    public final SchemaWalker.schema_def_return schema_def() throws RecognitionException {
        SchemaWalker.schema_def_return retval = new SchemaWalker.schema_def_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        SchemaWalker.entity_def_return entity_def5 =null;

        SchemaWalker.dom_def_return dom_def6 =null;

        SchemaWalker.elem_def_return elem_def7 =null;

        SchemaWalker.link_def_return link_def8 =null;



        try {
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaWalker.g:23:11: ( entity_def | dom_def | elem_def | link_def )
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
                    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaWalker.g:24:4: entity_def
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_entity_def_in_schema_def88);
                    entity_def5=entity_def();

                    state._fsp--;

                    adaptor.addChild(root_0, entity_def5.getTree());


                    }
                    break;
                case 2 :
                    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaWalker.g:25:4: dom_def
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_dom_def_in_schema_def93);
                    dom_def6=dom_def();

                    state._fsp--;

                    adaptor.addChild(root_0, dom_def6.getTree());


                    }
                    break;
                case 3 :
                    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaWalker.g:26:4: elem_def
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_elem_def_in_schema_def98);
                    elem_def7=elem_def();

                    state._fsp--;

                    adaptor.addChild(root_0, elem_def7.getTree());


                    }
                    break;
                case 4 :
                    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaWalker.g:27:4: link_def
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_link_def_in_schema_def103);
                    link_def8=link_def();

                    state._fsp--;

                    adaptor.addChild(root_0, link_def8.getTree());


                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

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
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "set_property"
    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaWalker.g:33:1: set_property : ^( SET ID STRING ) ;
    public final SchemaWalker.set_property_return set_property() throws RecognitionException {
        SchemaWalker.set_property_return retval = new SchemaWalker.set_property_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree SET9=null;
        CommonTree ID10=null;
        CommonTree STRING11=null;

        CommonTree SET9_tree=null;
        CommonTree ID10_tree=null;
        CommonTree STRING11_tree=null;

        try {
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaWalker.g:33:13: ( ^( SET ID STRING ) )
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaWalker.g:34:2: ^( SET ID STRING )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            SET9=(CommonTree)match(input,SET,FOLLOW_SET_in_set_property116); 
            SET9_tree = (CommonTree)adaptor.dupNode(SET9);


            root_1 = (CommonTree)adaptor.becomeRoot(SET9_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            ID10=(CommonTree)match(input,ID,FOLLOW_ID_in_set_property118); 
            ID10_tree = (CommonTree)adaptor.dupNode(ID10);


            adaptor.addChild(root_1, ID10_tree);


            _last = (CommonTree)input.LT(1);
            STRING11=(CommonTree)match(input,STRING,FOLLOW_STRING_in_set_property120); 
            STRING11_tree = (CommonTree)adaptor.dupNode(STRING11);


            adaptor.addChild(root_1, STRING11_tree);


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            schema.setProperty((ID10!=null?ID10.getText():null), (STRING11!=null?STRING11.getText():null));

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

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
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "entity_def"
    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaWalker.g:37:1: entity_def : ^( ENTITY ID ( elem_use )+ ) ;
    public final SchemaWalker.entity_def_return entity_def() throws RecognitionException {
        SchemaWalker.entity_def_return retval = new SchemaWalker.entity_def_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ENTITY12=null;
        CommonTree ID13=null;
        SchemaWalker.elem_use_return elem_use14 =null;


        CommonTree ENTITY12_tree=null;
        CommonTree ID13_tree=null;

        try {
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaWalker.g:37:11: ( ^( ENTITY ID ( elem_use )+ ) )
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaWalker.g:38:2: ^( ENTITY ID ( elem_use )+ )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            ENTITY12=(CommonTree)match(input,ENTITY,FOLLOW_ENTITY_in_entity_def135); 
            ENTITY12_tree = (CommonTree)adaptor.dupNode(ENTITY12);


            root_1 = (CommonTree)adaptor.becomeRoot(ENTITY12_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            ID13=(CommonTree)match(input,ID,FOLLOW_ID_in_entity_def137); 
            ID13_tree = (CommonTree)adaptor.dupNode(ID13);


            adaptor.addChild(root_1, ID13_tree);


            schema.addEntity((ID13!=null?ID13.getText():null)); currentEntity = (ID13!=null?ID13.getText():null);

            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaWalker.g:38:70: ( elem_use )+
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
            	    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaWalker.g:38:70: elem_use
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_elem_use_in_entity_def141);
            	    elem_use14=elem_use();

            	    state._fsp--;

            	    adaptor.addChild(root_1, elem_use14.getTree());


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
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

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
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "link_def"
    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaWalker.g:42:1: link_def : ^( LINK id= ID (dir= FROM |dir= BETWEEN ) left_side= ID (left_card= ONE |left_card= MANY ) right_side= ID (right_card= ONE |right_card= MANY ) ) ;
    public final SchemaWalker.link_def_return link_def() throws RecognitionException {
        SchemaWalker.link_def_return retval = new SchemaWalker.link_def_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree id=null;
        CommonTree dir=null;
        CommonTree left_side=null;
        CommonTree left_card=null;
        CommonTree right_side=null;
        CommonTree right_card=null;
        CommonTree LINK15=null;

        CommonTree id_tree=null;
        CommonTree dir_tree=null;
        CommonTree left_side_tree=null;
        CommonTree left_card_tree=null;
        CommonTree right_side_tree=null;
        CommonTree right_card_tree=null;
        CommonTree LINK15_tree=null;

        try {
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaWalker.g:42:9: ( ^( LINK id= ID (dir= FROM |dir= BETWEEN ) left_side= ID (left_card= ONE |left_card= MANY ) right_side= ID (right_card= ONE |right_card= MANY ) ) )
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaWalker.g:43:3: ^( LINK id= ID (dir= FROM |dir= BETWEEN ) left_side= ID (left_card= ONE |left_card= MANY ) right_side= ID (right_card= ONE |right_card= MANY ) )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            LINK15=(CommonTree)match(input,LINK,FOLLOW_LINK_in_link_def156); 
            LINK15_tree = (CommonTree)adaptor.dupNode(LINK15);


            root_1 = (CommonTree)adaptor.becomeRoot(LINK15_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            id=(CommonTree)match(input,ID,FOLLOW_ID_in_link_def160); 
            id_tree = (CommonTree)adaptor.dupNode(id);


            adaptor.addChild(root_1, id_tree);


            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaWalker.g:43:16: (dir= FROM |dir= BETWEEN )
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
                    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaWalker.g:43:17: dir= FROM
                    {
                    _last = (CommonTree)input.LT(1);
                    dir=(CommonTree)match(input,FROM,FOLLOW_FROM_in_link_def165); 
                    dir_tree = (CommonTree)adaptor.dupNode(dir);


                    adaptor.addChild(root_1, dir_tree);


                    }
                    break;
                case 2 :
                    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaWalker.g:43:26: dir= BETWEEN
                    {
                    _last = (CommonTree)input.LT(1);
                    dir=(CommonTree)match(input,BETWEEN,FOLLOW_BETWEEN_in_link_def169); 
                    dir_tree = (CommonTree)adaptor.dupNode(dir);


                    adaptor.addChild(root_1, dir_tree);


                    }
                    break;

            }


            _last = (CommonTree)input.LT(1);
            left_side=(CommonTree)match(input,ID,FOLLOW_ID_in_link_def174); 
            left_side_tree = (CommonTree)adaptor.dupNode(left_side);


            adaptor.addChild(root_1, left_side_tree);


            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaWalker.g:43:52: (left_card= ONE |left_card= MANY )
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
                    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaWalker.g:43:53: left_card= ONE
                    {
                    _last = (CommonTree)input.LT(1);
                    left_card=(CommonTree)match(input,ONE,FOLLOW_ONE_in_link_def179); 
                    left_card_tree = (CommonTree)adaptor.dupNode(left_card);


                    adaptor.addChild(root_1, left_card_tree);


                    }
                    break;
                case 2 :
                    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaWalker.g:43:67: left_card= MANY
                    {
                    _last = (CommonTree)input.LT(1);
                    left_card=(CommonTree)match(input,MANY,FOLLOW_MANY_in_link_def183); 
                    left_card_tree = (CommonTree)adaptor.dupNode(left_card);


                    adaptor.addChild(root_1, left_card_tree);


                    }
                    break;

            }


            _last = (CommonTree)input.LT(1);
            right_side=(CommonTree)match(input,ID,FOLLOW_ID_in_link_def188); 
            right_side_tree = (CommonTree)adaptor.dupNode(right_side);


            adaptor.addChild(root_1, right_side_tree);


            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaWalker.g:43:97: (right_card= ONE |right_card= MANY )
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
                    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaWalker.g:43:98: right_card= ONE
                    {
                    _last = (CommonTree)input.LT(1);
                    right_card=(CommonTree)match(input,ONE,FOLLOW_ONE_in_link_def193); 
                    right_card_tree = (CommonTree)adaptor.dupNode(right_card);


                    adaptor.addChild(root_1, right_card_tree);


                    }
                    break;
                case 2 :
                    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaWalker.g:43:113: right_card= MANY
                    {
                    _last = (CommonTree)input.LT(1);
                    right_card=(CommonTree)match(input,MANY,FOLLOW_MANY_in_link_def197); 
                    right_card_tree = (CommonTree)adaptor.dupNode(right_card);


                    adaptor.addChild(root_1, right_card_tree);


                    }
                    break;

            }


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }



            		schema.addSchemaLink((id!=null?id.getText():null), (left_side!=null?left_side.getText():null), (right_side!=null?right_side.getText():null), (left_card!=null?left_card.getText():null), (right_card!=null?right_card.getText():null), (dir!=null?dir.getText():null));
            	

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

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
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "dom_def"
    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaWalker.g:49:1: dom_def returns [String domainID] : ^( DOMAIN ID (t= TYPE_STRING |t= TYPE_INT |t= TYPE_NUMBER |t= TYPE_TIMESTAMP |t= TYPE_DATE ) ( LENGTH l= INT ( PRECISION p= INT )? )? ) ;
    public final SchemaWalker.dom_def_return dom_def() throws RecognitionException {
        SchemaWalker.dom_def_return retval = new SchemaWalker.dom_def_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree t=null;
        CommonTree l=null;
        CommonTree p=null;
        CommonTree DOMAIN16=null;
        CommonTree ID17=null;
        CommonTree LENGTH18=null;
        CommonTree PRECISION19=null;

        CommonTree t_tree=null;
        CommonTree l_tree=null;
        CommonTree p_tree=null;
        CommonTree DOMAIN16_tree=null;
        CommonTree ID17_tree=null;
        CommonTree LENGTH18_tree=null;
        CommonTree PRECISION19_tree=null;

        try {
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaWalker.g:49:33: ( ^( DOMAIN ID (t= TYPE_STRING |t= TYPE_INT |t= TYPE_NUMBER |t= TYPE_TIMESTAMP |t= TYPE_DATE ) ( LENGTH l= INT ( PRECISION p= INT )? )? ) )
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaWalker.g:50:2: ^( DOMAIN ID (t= TYPE_STRING |t= TYPE_INT |t= TYPE_NUMBER |t= TYPE_TIMESTAMP |t= TYPE_DATE ) ( LENGTH l= INT ( PRECISION p= INT )? )? )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            DOMAIN16=(CommonTree)match(input,DOMAIN,FOLLOW_DOMAIN_in_dom_def216); 
            DOMAIN16_tree = (CommonTree)adaptor.dupNode(DOMAIN16);


            root_1 = (CommonTree)adaptor.becomeRoot(DOMAIN16_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            ID17=(CommonTree)match(input,ID,FOLLOW_ID_in_dom_def218); 
            ID17_tree = (CommonTree)adaptor.dupNode(ID17);


            adaptor.addChild(root_1, ID17_tree);


            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaWalker.g:50:14: (t= TYPE_STRING |t= TYPE_INT |t= TYPE_NUMBER |t= TYPE_TIMESTAMP |t= TYPE_DATE )
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
                    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaWalker.g:50:15: t= TYPE_STRING
                    {
                    _last = (CommonTree)input.LT(1);
                    t=(CommonTree)match(input,TYPE_STRING,FOLLOW_TYPE_STRING_in_dom_def223); 
                    t_tree = (CommonTree)adaptor.dupNode(t);


                    adaptor.addChild(root_1, t_tree);


                    }
                    break;
                case 2 :
                    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaWalker.g:50:31: t= TYPE_INT
                    {
                    _last = (CommonTree)input.LT(1);
                    t=(CommonTree)match(input,TYPE_INT,FOLLOW_TYPE_INT_in_dom_def229); 
                    t_tree = (CommonTree)adaptor.dupNode(t);


                    adaptor.addChild(root_1, t_tree);


                    }
                    break;
                case 3 :
                    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaWalker.g:50:44: t= TYPE_NUMBER
                    {
                    _last = (CommonTree)input.LT(1);
                    t=(CommonTree)match(input,TYPE_NUMBER,FOLLOW_TYPE_NUMBER_in_dom_def235); 
                    t_tree = (CommonTree)adaptor.dupNode(t);


                    adaptor.addChild(root_1, t_tree);


                    }
                    break;
                case 4 :
                    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaWalker.g:50:60: t= TYPE_TIMESTAMP
                    {
                    _last = (CommonTree)input.LT(1);
                    t=(CommonTree)match(input,TYPE_TIMESTAMP,FOLLOW_TYPE_TIMESTAMP_in_dom_def241); 
                    t_tree = (CommonTree)adaptor.dupNode(t);


                    adaptor.addChild(root_1, t_tree);


                    }
                    break;
                case 5 :
                    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaWalker.g:50:79: t= TYPE_DATE
                    {
                    _last = (CommonTree)input.LT(1);
                    t=(CommonTree)match(input,TYPE_DATE,FOLLOW_TYPE_DATE_in_dom_def247); 
                    t_tree = (CommonTree)adaptor.dupNode(t);


                    adaptor.addChild(root_1, t_tree);


                    }
                    break;

            }


            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaWalker.g:50:92: ( LENGTH l= INT ( PRECISION p= INT )? )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==LENGTH) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaWalker.g:50:93: LENGTH l= INT ( PRECISION p= INT )?
                    {
                    _last = (CommonTree)input.LT(1);
                    LENGTH18=(CommonTree)match(input,LENGTH,FOLLOW_LENGTH_in_dom_def251); 
                    LENGTH18_tree = (CommonTree)adaptor.dupNode(LENGTH18);


                    adaptor.addChild(root_1, LENGTH18_tree);


                    _last = (CommonTree)input.LT(1);
                    l=(CommonTree)match(input,INT,FOLLOW_INT_in_dom_def255); 
                    l_tree = (CommonTree)adaptor.dupNode(l);


                    adaptor.addChild(root_1, l_tree);


                    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaWalker.g:50:106: ( PRECISION p= INT )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==PRECISION) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaWalker.g:50:107: PRECISION p= INT
                            {
                            _last = (CommonTree)input.LT(1);
                            PRECISION19=(CommonTree)match(input,PRECISION,FOLLOW_PRECISION_in_dom_def258); 
                            PRECISION19_tree = (CommonTree)adaptor.dupNode(PRECISION19);


                            adaptor.addChild(root_1, PRECISION19_tree);


                            _last = (CommonTree)input.LT(1);
                            p=(CommonTree)match(input,INT,FOLLOW_INT_in_dom_def262); 
                            p_tree = (CommonTree)adaptor.dupNode(p);


                            adaptor.addChild(root_1, p_tree);


                            }
                            break;

                    }


                    }
                    break;

            }


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            schema.addDomain((ID17!=null?ID17.getText():null), (t!=null?t.getText():null), (l!=null?l.getText():null), (p!=null?p.getText():null));
            	retval.domainID = (ID17!=null?ID17.getText():null);

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

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
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "dom_use"
    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaWalker.g:55:1: dom_use returns [String domainID] : ( dom_def | ^( DOMAIN ID ) );
    public final SchemaWalker.dom_use_return dom_use() throws RecognitionException {
        SchemaWalker.dom_use_return retval = new SchemaWalker.dom_use_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree DOMAIN21=null;
        CommonTree ID22=null;
        SchemaWalker.dom_def_return dom_def20 =null;


        CommonTree DOMAIN21_tree=null;
        CommonTree ID22_tree=null;

        try {
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaWalker.g:55:33: ( dom_def | ^( DOMAIN ID ) )
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
                    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaWalker.g:56:2: dom_def
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_dom_def_in_dom_use286);
                    dom_def20=dom_def();

                    state._fsp--;

                    adaptor.addChild(root_0, dom_def20.getTree());


                    retval.domainID = (dom_def20!=null?dom_def20.domainID:null);

                    }
                    break;
                case 2 :
                    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaWalker.g:57:2: ^( DOMAIN ID )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    DOMAIN21=(CommonTree)match(input,DOMAIN,FOLLOW_DOMAIN_in_dom_use293); 
                    DOMAIN21_tree = (CommonTree)adaptor.dupNode(DOMAIN21);


                    root_1 = (CommonTree)adaptor.becomeRoot(DOMAIN21_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    ID22=(CommonTree)match(input,ID,FOLLOW_ID_in_dom_use295); 
                    ID22_tree = (CommonTree)adaptor.dupNode(ID22);


                    adaptor.addChild(root_1, ID22_tree);


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    retval.domainID = (ID22!=null?ID22.getText():null);

                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

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
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "elem_def"
    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaWalker.g:60:1: elem_def returns [String elementID] : ^( ELEMENT id= ID ( STEXT s= STRING )? ( MTEXT m= STRING )? ( LTEXT l= STRING )? dom_use ) ;
    public final SchemaWalker.elem_def_return elem_def() throws RecognitionException {
        SchemaWalker.elem_def_return retval = new SchemaWalker.elem_def_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree id=null;
        CommonTree s=null;
        CommonTree m=null;
        CommonTree l=null;
        CommonTree ELEMENT23=null;
        CommonTree STEXT24=null;
        CommonTree MTEXT25=null;
        CommonTree LTEXT26=null;
        SchemaWalker.dom_use_return dom_use27 =null;


        CommonTree id_tree=null;
        CommonTree s_tree=null;
        CommonTree m_tree=null;
        CommonTree l_tree=null;
        CommonTree ELEMENT23_tree=null;
        CommonTree STEXT24_tree=null;
        CommonTree MTEXT25_tree=null;
        CommonTree LTEXT26_tree=null;

        try {
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaWalker.g:60:35: ( ^( ELEMENT id= ID ( STEXT s= STRING )? ( MTEXT m= STRING )? ( LTEXT l= STRING )? dom_use ) )
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaWalker.g:61:2: ^( ELEMENT id= ID ( STEXT s= STRING )? ( MTEXT m= STRING )? ( LTEXT l= STRING )? dom_use )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            ELEMENT23=(CommonTree)match(input,ELEMENT,FOLLOW_ELEMENT_in_elem_def313); 
            ELEMENT23_tree = (CommonTree)adaptor.dupNode(ELEMENT23);


            root_1 = (CommonTree)adaptor.becomeRoot(ELEMENT23_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            id=(CommonTree)match(input,ID,FOLLOW_ID_in_elem_def317); 
            id_tree = (CommonTree)adaptor.dupNode(id);


            adaptor.addChild(root_1, id_tree);


            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaWalker.g:61:18: ( STEXT s= STRING )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==STEXT) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaWalker.g:61:19: STEXT s= STRING
                    {
                    _last = (CommonTree)input.LT(1);
                    STEXT24=(CommonTree)match(input,STEXT,FOLLOW_STEXT_in_elem_def320); 
                    STEXT24_tree = (CommonTree)adaptor.dupNode(STEXT24);


                    adaptor.addChild(root_1, STEXT24_tree);


                    _last = (CommonTree)input.LT(1);
                    s=(CommonTree)match(input,STRING,FOLLOW_STRING_in_elem_def324); 
                    s_tree = (CommonTree)adaptor.dupNode(s);


                    adaptor.addChild(root_1, s_tree);


                    }
                    break;

            }


            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaWalker.g:61:36: ( MTEXT m= STRING )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==MTEXT) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaWalker.g:61:37: MTEXT m= STRING
                    {
                    _last = (CommonTree)input.LT(1);
                    MTEXT25=(CommonTree)match(input,MTEXT,FOLLOW_MTEXT_in_elem_def329); 
                    MTEXT25_tree = (CommonTree)adaptor.dupNode(MTEXT25);


                    adaptor.addChild(root_1, MTEXT25_tree);


                    _last = (CommonTree)input.LT(1);
                    m=(CommonTree)match(input,STRING,FOLLOW_STRING_in_elem_def333); 
                    m_tree = (CommonTree)adaptor.dupNode(m);


                    adaptor.addChild(root_1, m_tree);


                    }
                    break;

            }


            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaWalker.g:61:54: ( LTEXT l= STRING )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==LTEXT) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaWalker.g:61:55: LTEXT l= STRING
                    {
                    _last = (CommonTree)input.LT(1);
                    LTEXT26=(CommonTree)match(input,LTEXT,FOLLOW_LTEXT_in_elem_def338); 
                    LTEXT26_tree = (CommonTree)adaptor.dupNode(LTEXT26);


                    adaptor.addChild(root_1, LTEXT26_tree);


                    _last = (CommonTree)input.LT(1);
                    l=(CommonTree)match(input,STRING,FOLLOW_STRING_in_elem_def342); 
                    l_tree = (CommonTree)adaptor.dupNode(l);


                    adaptor.addChild(root_1, l_tree);


                    }
                    break;

            }


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_dom_use_in_elem_def346);
            dom_use27=dom_use();

            state._fsp--;

            adaptor.addChild(root_1, dom_use27.getTree());


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }



            	schema.addElement((id!=null?id.getText():null), (s!=null?s.getText():null), (m!=null?m.getText():null), (l!=null?l.getText():null), schema.findDomain((dom_use27!=null?dom_use27.domainID:null)));
            	retval.elementID = (id!=null?id.getText():null);
            	

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

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
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "key_elem_def"
    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaWalker.g:69:1: key_elem_def returns [String elementID] : ( ^( KEY ed= elem_def ) | ^( KEY ne= named_elem ) );
    public final SchemaWalker.key_elem_def_return key_elem_def() throws RecognitionException {
        SchemaWalker.key_elem_def_return retval = new SchemaWalker.key_elem_def_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree KEY28=null;
        CommonTree KEY29=null;
        SchemaWalker.elem_def_return ed =null;

        SchemaWalker.named_elem_return ne =null;


        CommonTree KEY28_tree=null;
        CommonTree KEY29_tree=null;

        try {
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaWalker.g:69:39: ( ^( KEY ed= elem_def ) | ^( KEY ne= named_elem ) )
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
                    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaWalker.g:70:2: ^( KEY ed= elem_def )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    KEY28=(CommonTree)match(input,KEY,FOLLOW_KEY_in_key_elem_def366); 
                    KEY28_tree = (CommonTree)adaptor.dupNode(KEY28);


                    root_1 = (CommonTree)adaptor.becomeRoot(KEY28_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_elem_def_in_key_elem_def370);
                    ed=elem_def();

                    state._fsp--;

                    adaptor.addChild(root_1, ed.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    retval.elementID = (ed!=null?ed.elementID:null);

                    }
                    break;
                case 2 :
                    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaWalker.g:71:2: ^( KEY ne= named_elem )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    KEY29=(CommonTree)match(input,KEY,FOLLOW_KEY_in_key_elem_def378); 
                    KEY29_tree = (CommonTree)adaptor.dupNode(KEY29);


                    root_1 = (CommonTree)adaptor.becomeRoot(KEY29_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_named_elem_in_key_elem_def382);
                    ne=named_elem();

                    state._fsp--;

                    adaptor.addChild(root_1, ne.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    retval.elementID = (ne!=null?ne.elementID:null);

                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

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
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "named_elem"
    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaWalker.g:74:1: named_elem returns [String elementID] : ^( ELEMENT ID ) ;
    public final SchemaWalker.named_elem_return named_elem() throws RecognitionException {
        SchemaWalker.named_elem_return retval = new SchemaWalker.named_elem_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ELEMENT30=null;
        CommonTree ID31=null;

        CommonTree ELEMENT30_tree=null;
        CommonTree ID31_tree=null;

        try {
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaWalker.g:74:37: ( ^( ELEMENT ID ) )
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaWalker.g:75:2: ^( ELEMENT ID )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            ELEMENT30=(CommonTree)match(input,ELEMENT,FOLLOW_ELEMENT_in_named_elem400); 
            ELEMENT30_tree = (CommonTree)adaptor.dupNode(ELEMENT30);


            root_1 = (CommonTree)adaptor.becomeRoot(ELEMENT30_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            ID31=(CommonTree)match(input,ID,FOLLOW_ID_in_named_elem402); 
            ID31_tree = (CommonTree)adaptor.dupNode(ID31);


            adaptor.addChild(root_1, ID31_tree);


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            retval.elementID = (ID31!=null?ID31.getText():null);

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

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
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "elem_use"
    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaWalker.g:78:1: elem_use returns [String elementID, Boolean isKey] : ( elem_def | key_elem_def | named_elem );
    public final SchemaWalker.elem_use_return elem_use() throws RecognitionException {
        SchemaWalker.elem_use_return retval = new SchemaWalker.elem_use_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        SchemaWalker.elem_def_return elem_def32 =null;

        SchemaWalker.key_elem_def_return key_elem_def33 =null;

        SchemaWalker.named_elem_return named_elem34 =null;



        try {
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaWalker.g:78:50: ( elem_def | key_elem_def | named_elem )
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
                    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaWalker.g:79:2: elem_def
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_elem_def_in_elem_use419);
                    elem_def32=elem_def();

                    state._fsp--;

                    adaptor.addChild(root_0, elem_def32.getTree());


                    retval.elementID = (elem_def32!=null?elem_def32.elementID:null); schema.findEntity(currentEntity).addElement(schema.findElement(retval.elementID), false);

                    }
                    break;
                case 2 :
                    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaWalker.g:80:2: key_elem_def
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_key_elem_def_in_elem_use425);
                    key_elem_def33=key_elem_def();

                    state._fsp--;

                    adaptor.addChild(root_0, key_elem_def33.getTree());


                    retval.elementID = (key_elem_def33!=null?key_elem_def33.elementID:null); schema.findEntity(currentEntity).addElement(schema.findElement(retval.elementID), true);

                    }
                    break;
                case 3 :
                    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaWalker.g:81:2: named_elem
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_named_elem_in_elem_use431);
                    named_elem34=named_elem();

                    state._fsp--;

                    adaptor.addChild(root_0, named_elem34.getTree());


                    retval.elementID = (named_elem34!=null?named_elem34.elementID:null); schema.findEntity(currentEntity).addElement(schema.findElement(retval.elementID), false);

                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

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
    public static final BitSet FOLLOW_schema_def_in_schema_file72 = new BitSet(new long[]{0x0000000000010688L});
    public static final BitSet FOLLOW_entity_def_in_schema_def88 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dom_def_in_schema_def93 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_elem_def_in_schema_def98 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_link_def_in_schema_def103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SET_in_set_property116 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_set_property118 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_STRING_in_set_property120 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ENTITY_in_entity_def135 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_entity_def137 = new BitSet(new long[]{0x0000000000004200L});
    public static final BitSet FOLLOW_elem_use_in_entity_def141 = new BitSet(new long[]{0x0000000000004208L});
    public static final BitSet FOLLOW_LINK_in_link_def156 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_link_def160 = new BitSet(new long[]{0x0000000000000840L});
    public static final BitSet FOLLOW_FROM_in_link_def165 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_BETWEEN_in_link_def169 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ID_in_link_def174 = new BitSet(new long[]{0x0000000000880000L});
    public static final BitSet FOLLOW_ONE_in_link_def179 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_MANY_in_link_def183 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ID_in_link_def188 = new BitSet(new long[]{0x0000000000880000L});
    public static final BitSet FOLLOW_ONE_in_link_def193 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MANY_in_link_def197 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DOMAIN_in_dom_def216 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_dom_def218 = new BitSet(new long[]{0x0000003E00000000L});
    public static final BitSet FOLLOW_TYPE_STRING_in_dom_def223 = new BitSet(new long[]{0x0000000000008008L});
    public static final BitSet FOLLOW_TYPE_INT_in_dom_def229 = new BitSet(new long[]{0x0000000000008008L});
    public static final BitSet FOLLOW_TYPE_NUMBER_in_dom_def235 = new BitSet(new long[]{0x0000000000008008L});
    public static final BitSet FOLLOW_TYPE_TIMESTAMP_in_dom_def241 = new BitSet(new long[]{0x0000000000008008L});
    public static final BitSet FOLLOW_TYPE_DATE_in_dom_def247 = new BitSet(new long[]{0x0000000000008008L});
    public static final BitSet FOLLOW_LENGTH_in_dom_def251 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_INT_in_dom_def255 = new BitSet(new long[]{0x0000000001000008L});
    public static final BitSet FOLLOW_PRECISION_in_dom_def258 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_INT_in_dom_def262 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_dom_def_in_dom_use286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOMAIN_in_dom_use293 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_dom_use295 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ELEMENT_in_elem_def313 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_elem_def317 = new BitSet(new long[]{0x0000000020220080L});
    public static final BitSet FOLLOW_STEXT_in_elem_def320 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_STRING_in_elem_def324 = new BitSet(new long[]{0x0000000000220080L});
    public static final BitSet FOLLOW_MTEXT_in_elem_def329 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_STRING_in_elem_def333 = new BitSet(new long[]{0x0000000000020080L});
    public static final BitSet FOLLOW_LTEXT_in_elem_def338 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_STRING_in_elem_def342 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_dom_use_in_elem_def346 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_KEY_in_key_elem_def366 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_elem_def_in_key_elem_def370 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_KEY_in_key_elem_def378 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_named_elem_in_key_elem_def382 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ELEMENT_in_named_elem400 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_named_elem402 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_elem_def_in_elem_use419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_key_elem_def_in_elem_use425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_named_elem_in_elem_use431 = new BitSet(new long[]{0x0000000000000002L});

}