# Analysis of genetic algorithm operators on Human Traits


## INTRODUCTION
        
### Purpose of the Project 

Exploring and analyzing the workings of the optimization algorithm – Genetic Algorithm. Optimizing the algorithm using various crossover and mutation techniques to find the best combination for our data.

###  Target Beneficiary 

When faced with a number of possible choices that depend on a number of factors, optimization algorithms could play a crucial role in choosing the "Best" solution based on a value obtained from an objective function. This function will provide a measure to indicate how good/bad the choice is.
Genetic Algorithm is one such algorithm which always generates a solution and also the one that improves with time or successive iterations.



### Project Scope 

Genetic Algorithm can deal with various types of optimizations, whether the objective function is stationary or nonstationary, linear or nonlinear, continuous or discontinuous, or with random noise. Because multiple offspring in a population act like independent agents, the population can explore the search space in many directions simultaneously. This feature makes it ideal to parallelize the algorithms for implementation. Different parameters and even different groups of  strings can be manipulated at the same time.


### References 


    • https://towardsdatascience.com/an-illustrated-guide-to-genetic-algorithm-ec5615c9ebe

    • https://medium.datadriveninvestor.com/an-insight-into-genetic-algorithms-93428953c098

    • https://towardsdatascience.com/introduction-to-optimization-with-genetic-algorithm-2f5001d9964b

    • https://www.researchgate.net/publication/309770246_A_Study_on_Genetic_Algorithm_and_its_Applications


## METHODOLOGY 

![image](https://user-images.githubusercontent.com/35265516/144186327-ac73b1ef-449c-4edc-a6b8-456358cc4603.png)


## PROJECT DESCRIPTION


### Reference Algorithm 

Genetic Algorithms are a part of evolutionary computing that is a rapidly growing area of AI (Artificial Intelligence). Genetic Algorithms are being widely used because of its robust nature that provide optimization over large space state (set of nodes representing each state of the problem). The process of biological evolution based on Charles Darwin’s theory of natural selection, where fitter individuals are more likely to pass on their genes to the next generation, inspires genetic Algorithms. Genetic algorithm uses the crossover and recombination, mutation, and selection in the study of adaptive and artificial systems. These genetic operators form the essential part of the genetic algorithm as a problem-solving strategy.

![image](https://user-images.githubusercontent.com/35265516/144185951-20d8315b-6dc9-4645-9250-404724cb420c.png)


Genetic Algorithms are categorized as global search heuristics. A genetic algorithm is a search technique used in computing to find true or approximate solutions to optimization and search problems. Genetic Algorithm uses a variety of operators during the search process. These operators are encoding schemes, crossover, mutation, and selection.

![1_dR4mHdPqvsEfoMluiYGcVg](https://user-images.githubusercontent.com/35265516/144186059-6489e132-bc13-49aa-8c24-726c7042350d.gif)

Working of Genetic Algorithm:
*
formulate initial population
randomly initialize population
repeat
evaluate objective function
find fitness function
apply genetic operators
reproduction
crossover
mutation
until stopping criteria
*

![image](https://user-images.githubusercontent.com/55507908/144181219-fd5eafdf-471a-4e40-ba59-d099703193fc.png)

### Initialization 

The initial stage in genetic algorithms is to initialize populations. At this stage, we must determine the population and length of the chromosomes to be used. For determining the number of the population, itself there is no provision for the amount. The greater the number of populations will produce more variety of solutions, thus increasing the possibility of achieving the best solution.

### Fitness Function 

A fitness function is first derived to be used in successive genetic operations. Fitness in biological sense is a quality value which is a measure of the reproductive efficiency of chromosomes. In genetic algorithm, fitness is used to allocate reproductive traits to the individuals in the population and thus act as some measure of goodness to be maximized. This means that individuals with higher fitness value will have higher probability of being selected as candidates for further examination.

### Selection/Elitism 

(We have used elitism instead of the standard selection process)
Here we arranged the parents on the basis of their fitness score and took the best parents from it.

### Mutation 
After selecting parents, the next step we will do is to do a crossover. Crossover is a process for producing new chromosomes. Crossover is done between two chromosomes, and the result of the crossover is two chromosomes.
Many crossover operators exist in the GA literature. One site crossover and two site crossover are the most common ones adopted. In most crossover operators, two strings are picked from the mating pool at random and some portions of the strings are exchanged between the strings. Crossover operation is done at string level by randomly selecting two strings for crossover operations. A one site crossover operator is performed by randomly choosing a crossing site along the string and by exchanging all bits on the right side of the crossing site
    • Mutation
Almost the same as a crossover, mutations are not always done due to the probability of mutations. The probability of mutation common being used is 0.1. As with crossover probabilities, there are no definite provisions regarding the value of mutation probabilities.

![image](https://user-images.githubusercontent.com/35265516/144186131-930218cb-b979-4233-8b5e-0a9675f0d22a.png)


    Application of these operators on the current population creates a new population. This new population is used to generate subsequent populations and so on, yielding solutions that are closer to the optimum solution. The values of the objective function of the individuals of the new population are again determined by decoding the strings. These values express the fitness of the solutions of the new generations. This completes one cycle of genetic algorithm called a generation. In each generation if the solution is improved, it is stored as the best solution. This is repeated till convergence.

Data Structures:
The primitive data structures that are being used in the project include arrays.






### DEMO

#### Intialising the population
![image](https://user-images.githubusercontent.com/55507908/144184992-a660864b-29a0-436f-9ea3-d12de7f4dc96.png)
#### Selecting Breeding and mutation process
- ![image](https://user-images.githubusercontent.com/55507908/144185062-77247ed0-0360-4b7e-a164-50dcfcb8606e.png)
#### desired Output:
- ![image](https://user-images.githubusercontent.com/55507908/144185105-64816037-2f7c-4d3b-af8c-9bc506214bc2.png)


### Collaborators


<table>
    <th> Name </th>
    <th> Link 🔗 </th>
    <tr>
        <td> Akash joshi </td>
        <td> https://github.com/Jogi-official </td>
    </tr>
    <tr>
        <td> Animesh Sundriyal </td>
        <td> https://github.com/Animesh77666 </td>
    </tr>
    <tr>
        <td> Abhishek Shrivastava </td>
        <td> https://github.com/2023PHOENIX </td>
    </tr>
    <tr>
        <td> AdityaPal Singh Rathore </td>
        <td> https://github.com/AdityaRathore2609 </td>
    </tr>
</table>

