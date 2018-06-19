# proguard-allowaccessmodification
Proguard issue with protected resources when using -allowaccessmodification

Reported at: https://sourceforge.net/p/proguard/bugs/711/

Usage
----
 `$ gradle clean jar obfuscate run`

Output
----


```
:clean
:compileJava
:processResources NO-SOURCE
:classes
:jar
:obfuscate
:run
Exception in thread "main" java.lang.VerifyError: Bad access to protected data in getfield
Exception Details:
  Location:
    com/github/benji/proguard/MyClass.process(Lcom/github/a;)Z @1: getfield
  Reason:
    Type null (current frame, stack[1]) is not assignable to 'com/github/benji/proguard/MyClass'
  Current Frame:
    bci: @1
    flags: { }
    locals: { 'com/github/benji/proguard/MyClass', 'com/github/a' }
    stack: { 'java/lang/Object' }
  Bytecode:
    0x0000000: 2bb4 0003 c700 0704 a700 0403 ac       
  Stackmap Table:
    chop_frame(@11,2)
    same_locals_1_stack_item_frame(@12,Integer)

        at com.github.benji.proguard.Launcher.main(src:6)
:run FAILED

FAILURE: Build failed with an exception.

* What went wrong:
Execution failed for task ':run'.
> Process 'command '/usr/local/apps/jdk/bin/java'' finished with non-zero exit value 1

* Try:
Run with --stacktrace option to get the stack trace. Run with --info or --debug option to get more log output.

BUILD FAILED

Total time: 1.043 secs
```
