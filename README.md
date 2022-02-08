# README
To run on the command line use:
`./run`

This won't do anything until you implement your naive REPL!

I used object oriented programming to split my project into reasonable parts.
In main, I have objects of a CSV reader, which I use to read the CSV file
and output information about the file. I also have an object of Knearest, 
which uses Collections to sort the closest stars to a specified Star
or of inputted coordinates. To implement that object, I created a Star object,
which allowed me to create stars from the information I gained from the csv file.
Then I made a comparator object to find a way to sort the stars, which I used
to sort in the shortest distance to the specified input. 