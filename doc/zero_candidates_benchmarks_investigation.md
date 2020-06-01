## java-classmate-1.5.1

method not covered: equals(Object)  
class: com.fasterxml.classmate.types.TypePlaceHolder.
Not all of its sibling classes implemented this method

method not covered: readResolve()
classes: com.fasterxml.classmate.util.LRUTypeCache
         com.fasterxml.classmate.util.LRUTypeCache
Not declared in their direct superclass - com.fasterxml.classmate.util.ResolvedTypeCache


Overall, java-classmate-1.5.1 is covered quite well.

## jsoup-1.10.1

classes with uncovered methods:

org.jsoup.parser:

HtmlTreeBuilder: only subclass of TreeBuilder
TokenQueue, Tag, Parser, Tokeniser, CharacterReader, ParseError: no defined superclass
ParseErrorList: only subclass of ArrayList<ParseError>
Other uncovered method are in inner classes

org.jsoup.helper:

HttpConnection: only subclass of Connection
DescendableLinkedList<E>: only subclass of LinkedList<E>
Validate, DataUtil, W3CDom, StringUtil: no defined superclass
Other uncovered method are in inner classes

org.jsoup.nodes:

Element: all uncovered methods are getters.
TextNode: uncovered methods are not implemented in all of its sibling classes,
          outerHtmlTail(Appendable, int, Document.OutputSettings) is declared in all of its sibling classes,
          but only implemented in Element.
Document: its sibling class doesn't implement the uncovered methods
XmlDeclaration, Comment: toString() is not covered, but toString() is not implemented in one of its sibling class: DocumentType

org.jsoup:

HttpStatusException: uncovered methods are initializers, getters, or toString() method that is not implemented in all of its sibling classes.
