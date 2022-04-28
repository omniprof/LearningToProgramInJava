# LearningToProgramInJava
In this repository are the sample programs from the first video in the Learning To Program In Java. 

# Bonus Segment - Comments

In these samples you will find comments. Ideally you will create code with meaningful names for identifiers that will allow another developer to understand what you are doing. Comments allow you to add notes to your code. These notes should describe what the code is doing if it is not obvious. You may know exactly what you are coding today but will you remember your intentions in 6 months from now?

There are three ways to add comments to code: 

# //

A single line comment in Java begins with the double forward slash (//) and ends when the line ends. This is useful for adding comments to a single line

# <pre>/*      */</pre> 

This syntax allows you to enclose multi-line comments. It can also be used to comment out code that you do not wish to compile but are not yet ready to delete. It is usually a good idea to comment out code before you delete it in the case where the original code is better than its replacement. You cannot nest this comment in another. You can nest the single line comment.

/* Comment /* nested comment */ comment */ is not allowed

/* comment //single line comment more comment */ is allowed

# <pre>/**      */</pre>

This syntax that begins with a forward slash star star is used to create comment blocks in front of classes and methods. These comment blocks are picked up by a tool in Java called JavaDocs that creates html documentation pages from your code.
