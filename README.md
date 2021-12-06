# Sort Project by Leo Hoang

This project allows us to sort an Array or ArrayList. The arrays can only be sorted with ints as their elements.
But the ArrayList sort uses the Container object, which has a Generic "T" value. Although the program does not allow the user to create an Array List of Strings or char, it does work and 
is shown in the tests.

**CLASSES**:

BubbleSort, TreeSort, QuickSort: These classes each contain two methods with the algorithms to sort either an Array or ArrayList.

Sort: This is the interface that the above three classes implement.

Menu: The menu displays the options to the user and retrieves their inputs, it works in conjunction with the "Controller" class to provide part of the MVC.

Controller: This is the class which calls many other classes methods. Which method to call (which sorting algorithm) is determined by the input supplied from the Menu.

Generate: This class, is called by the Controller, which gets its "size" from the Menu of a specified size.

Container: This class is the type used in all the ArrayLists. As mentioned above, it contains one generic Value, which allows us to store any variable.

SortLog: The SortLog class is a basic class which provides the program with the functionality to create logs.

Main: This is the main, and calls the Menu. Nothing more, nothing less.

Tests: Asides from the standard tests, I also tested Generation of an Arraylist. Also, for each of the sorting algorithm tests, the last test prove that Strings 
can also be used for the sorting algorithms for the ArrayLists.

**NOTES**:

You may notice that many of the methods and variables are static. Although this program doesn't really use OOP, I found that for the purpose of this project, it worked fine. I would have
used less static variables and classes, however when we first started the project I used static classes as we were only creating very simple programs. I did not expect to have created a big,
full program from what we started on. Once I was near the end of the project, I didn't think it was worth the time to rebuild everything with objects in mind as the program was functional and did the job.
However, this also meant that it was more difficult to add in multi-threaded programming, which is why I don't have any.

With that in mind though, I did feel like I followed the MVC structure as best I could, and the program does follow the OOP principles. 