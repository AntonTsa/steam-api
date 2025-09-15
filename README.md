<h2>Task 1</h2>
The method takes a list of names as input and returns a string of the form `1. Ivan, 3. Peter...` 
with only those names that are under an odd index (1, 3, etc.)

<h2>Task 2</h2>
The method takes a list of strings as input. 
It returns a list of these strings in uppercase, and sorted in descending order (from Z to A).

<h2>Task 3</h2>
There is an array:
`["1, 2, 0", "4, 5"]`

The method gets all the numbers from the array, and outputs them in sorted form through commas, 

for example: `"0, 1, 2, 4, 5"`

<h2>Task 4</h2>
Using Stream.iterate, I created an infinite stream of random numbers, but without using Math.random().
Implemented linear congruent generator. To do this, started with x[0] = seed, and then calculated each subsequent element using a formula like `x[n + 1] = 1 (a x[n] + c) % m` for valid values 
of a, c, and m.

I implemented a method that takes the parameters a, c, and m as input and returns a Stream<Long>.

Using the following data for the test:

`a = 25214903917`
<br>
`c = 11`
<br>
`m = 2^48 (2 to the power of 48)`

<h2>Task 5</h2>
I wrote a `public static <T> Stream<T> zip(Stream<T> first, Stream<T> second)` method that "shuffles" the elements from the streams first and second, stopping when one of the streams runs out of elements.