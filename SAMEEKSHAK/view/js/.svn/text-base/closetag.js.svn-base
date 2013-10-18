/**
 * Tag-closer extension for CodeMirror.
 *
 * This extension adds a "closeTag" utility function that can be used with key bindings to 
 * insert a matching end tag after the ">" character of a start tag has been typed.  It can
 * also complete "</" if a matching start tag is found.  It will correctly ignore signal
 * characters for empty tags, comments, CDATA, etc.
 *
 * The function depends on internal parser state to identify tags.  It is compatible with the
 * following CodeMirror modes and will ignore all others:
 * - htmlmixed
 * - xml
 * - xmlpure
 *
 * See demos/closetag.html for a usage example.
 * 
 * @author Nathan Williams <nathan@nlwillia.net>
 * Contributed under the same license terms as CodeMirror.
 */
(function() {

	/** Option that allows tag closing behavior to be toggled.  Default is true. */
	CodeMirror.defaults['closeTagEnabled'] = true;

	/**
	 * Call during key processing to close tags.  Handles the key event if the tag is closed, otherwise throws CodeMirror.Pass.
	 * - cm: The editor instance.
	 * - ch: The character being processed.
	 * - indent: Optional.  Omit or pass true to use the default indentation tag list defined in the 'closeTagIndent' option.
	 *   Pass false to disable indentation.  Pass an array to override the default list of tag names.
	 */
	CodeMirror.defineExtension("closeTag", function(cm, ch, indent) {
		if (!cm.getOption('closeTagEnabled')) {
			throw CodeMirror.Pass;
		}
		
		var mode = cm.getOption('mode');
		
		if (mode == 'text/x-java') {
			
			var pos = cm.getCursor();
			var tok = cm.getTokenAt(pos);
			var abc="\"";
			if (ch == '{') {

					cm.replaceSelection('{'); // parity w/html modes
					pos = {line: pos.line, ch: pos.ch + 1};
					cm.setCursor(pos);
					insertEndTag(cm, indent, pos,"}");
					return;
				
				
			} else if (ch == '(') {
				
					cm.replaceSelection('('); // parity w/html modes
					pos = {line: pos.line, ch: pos.ch + 1};
					cm.setCursor(pos);
					insertEndTag(cm, indent, pos,")");
					return;
			} 
			else if (ch == '[') {
				
					cm.replaceSelection('['); // parity w/html modes
					pos = {line: pos.line, ch: pos.ch + 1};
					cm.setCursor(pos);
					insertEndTag(cm, indent, pos,"]");
					return;
			} 
			else if (ch == '\'') { 

					cm.replaceSelection("\'"); // parity w/html modes
					pos = {line: pos.line, ch: pos.ch + 1};
					cm.setCursor(pos);
					insertEndTag(cm, indent, pos,"\'");
					return;
			} 
			else if (ch =='\"') {
					cm.replaceSelection('\"'); // parity w/html modes
					pos = {line: pos.line, ch: pos.ch + 1};
					cm.setCursor(pos);
					insertEndTag(cm, indent, pos,"\"");
					return;
			} 
			
		}
		
		throw CodeMirror.Pass; // Bubble if not handled
	});

	function insertEndTag(cm, indent, pos, tagName) {
		if (shouldIndent(cm, indent, tagName)) {
			cm.replaceSelection('\n\n}', 'end');
			cm.indentLine(pos.line + 1);
			cm.indentLine(pos.line + 2);
			cm.setCursor({line: pos.line + 1, ch: cm.getLine(pos.line + 1).length});
		} else {
			if(tagName==')' )
			{
			cm.replaceSelection(tagName);
			cm.setCursor(pos);
			}
			else if(tagName==']')
			{
			cm.replaceSelection(tagName);
			cm.setCursor(pos);
			}
			else if(tagName=='}')
			{
			cm.replaceSelection(tagName);
			cm.setCursor(pos);
			}
			else if(tagName=='\'')
			{
			cm.replaceSelection(tagName);
			cm.setCursor(pos);
			}
			else if(tagName=='\"')
			{
			cm.replaceSelection(tagName);
			cm.setCursor(pos);
			}
		}
	}
	
	
	function shouldIndent(cm, indent, tagName) {
		if (typeof indent == 'undefined' || indent == null || indent == true) {
			indent = cm.getOption('closeTagIndent');
		}
		if (!indent) {
			indent = [];
		}
		return indexOf(indent, tagName.toLowerCase()) != -1;
	}
	
	// C&P from codemirror.js...would be nice if this were visible to utilities.
	function indexOf(collection, elt) {
		if (collection.indexOf) return collection.indexOf(elt);
		for (var i = 0, e = collection.length; i < e; ++i)
			if (collection[i] == elt) return i;
		return -1;
	}
	
})();
