### Common mistakes

#### Don't keep whole logic in the one huge method: 
In order to keep your code readable and reusable it's crucial to split large method into smaller ones.
Methods should not have more than an average of 30 code lines (not counting line spaces and comments).
If you have code publication it should moved to separate method as well.  
[More info](https://dzone.com/articles/rule-30-%E2%80%93-when-method-class-or)

#### Don't use public access modifiers everywhere
If method has only util purpose and is used only inside the same class it should not be 
public. Keep your code as closed as possible in order to follow encapsulation principal 

#### Follow checkstyle rules: 
 - While declaring methods and variables remember about general naming convention for different
elements in Java.
 - While writing loop and other constructions remember about spaces and indentation  
[CheckStyle rules](https://google.github.io/styleguide/javaguide.html)
