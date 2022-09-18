# Asg5
It looks as though I had a problem with the input buffer. 
I need to clear the input buffer after displayMenu inside main. 
The compiler read my input of 3 the first time through. 
The next time through, it read the \n I entered. 
When I typed 3, I also hit Enter, which is \n. 
That \n was still in the input buffer. 
This can happen in other languages as well, so it's good to know this. 
It's not often. 
We can normally avoid this with multiple Scanner objects for different types of data, but not in this case. 

After adding in "stdin.nextLine();" hoping this would solve my issue, I found that nothing changed.
The program is still calling only the milesToKilometers method and not the convertMilesToKilometers method 
so I will need to changed it to only call the convertMilesToKilometers.

Inside main, I can call displayMenu as before.  
If selection == 2,  ask user for miles and get miles.   
Then call the method in this way:
           float kilometers = convertMilesToKilometers(miles);
           
Once I did this, the conversions worked great! However, the GPA method did not. I again had to move it to my Main. 
Once i did that. Everything worked. 
I was trying to make my Main method as small as possible.
I plan to submit an updated Asg5.java once I learn more about this. 
