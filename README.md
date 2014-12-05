Skompilujeme to nasledovne:
  * antlr4 gc.g4 -visitor
  * javac *.java
  * g++ -shared -fPIC library.cpp -o library.so
Spustenie kompilatora:
  * java Compiler < vstup.c  > vystup.ll
Optimalizacia vygenerovaneho kodu:
  * opt -S -std-compile-opts vystup.ll > vystup.optimized.ll
Spustenie llvm kodu:
  * lli -load=./library.so vystup.optimized.ll
