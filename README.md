# Music ++

An advanced interpreter for musical language developed as a practice assigment for Compilers course from Bachelor course in informatics engineering mention in computing from Barcelona school of informatics in polytechnical university of Catalonia (FIB - UPC).

`Memoria CL.pdf` has all the relevant information fromt this project, explaining all their functionalities and structure.

## Usage

To run the compilter for a given song you should first create the song with the `.asl` extensions, following the schematics explained in the `Memoria CL.pdf`. Once the file is created you can run by executing (where file is the name of the song file):

```bash
  ./Asl -dot -ast file.dot -noexec file.asl
```

## Testing songs
We createed several songs for the user to test the compiler and its functionalities. All the songs are under `/bin/*.asl`. You can find a wide variety of complexities, from The office opening song to Bink's no sake.

## Technologies
- ANTLR3
- Java
