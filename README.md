![Java CI](https://github.com/xtermi2/java16/workflows/Java%20CI/badge.svg)

# Java 16 Features

- [JEP 338:    Vector API (Incubator)](https://openjdk.java.net/jeps/338)
    - see example `Scalar.java`
- [JEP 347:    Enable C++14 Language Features](https://openjdk.java.net/jeps/347)
    - Allow the use of C++14 language features in JDK C++ source code, and give specific guidance about which of those
      features may be used in HotSpot code.
- [JEP 357:    Migrate from Mercurial to Git](https://openjdk.java.net/jeps/357)
    - Migrate the OpenJDK Community's source code repositories from Mercurial (hg) to Git.
- [JEP 369:    Migrate to GitHub](https://openjdk.java.net/jeps/369)
    - Host the OpenJDK Community's Git repositories on GitHub.
- [JEP 376:    ZGC: Concurrent Thread-Stack Processing](https://openjdk.java.net/jeps/376)
    - Move ZGC thread-stack processing from safepoints to a concurrent phase.
- [JEP 380:    Unix-Domain Socket Channels](https://openjdk.java.net/jeps/380)
    - Add Unix-domain (AF_UNIX) socket support to the socket channel and server-socket channel APIs in the
      java.nio.channels package. Extend the inherited channel mechanism to support Unix-domain socket channels and
      server socket channels.
- [JEP 386:    Alpine Linux Port](https://openjdk.java.net/jeps/386)
    - Port the JDK to Alpine Linux, and to other Linux distributions that use musl as their primary C library, on both
      the x64 and AArch64 architectures,
- [JEP 387:    Elastic Metaspace](https://openjdk.java.net/jeps/387)
    - Return unused HotSpot class-metadata (i.e., metaspace) memory to the operating system more promptly, reduce
      metaspace footprint, and simplify the metaspace code in order to reduce maintenance costs.
- [JEP 388:    Windows/AArch64 Port](https://openjdk.java.net/jeps/388)
    - Port the JDK to Windows/AArch64 (ARM64).
- [JEP 389:    Foreign Linker API (Incubator)](https://openjdk.java.net/jeps/389)
    - Introduce an API that offers statically-typed, pure-Java access to native code.
    - see example `ForeignLinkerAPI.java`
- [JEP 390:    Warnings for Value-Based Classes](https://openjdk.java.net/jeps/390)
    - Primitive wrappers are now annotated with "@jdk.internal.ValueBased" which will produce compiler/hotspot warnings
      about behavior that is inconsistent with value based semantics, e.g. when using a Double as a synchronized object.
- [JEP 392:    Packaging Tool](https://openjdk.java.net/jeps/392)
    - Provide the jpackage tool, for packaging self-contained Java applications.
    - see example `Main.java`
- [JEP 393:    Foreign-Memory Access API (Third Incubator)](https://openjdk.java.net/jeps/393)
    - Introduce an API to allow Java programs to safely and efficiently access foreign memory outside of the Java heap.
- [JEP 394:    Pattern Matching for instanceof](https://openjdk.java.net/jeps/394)
    - see example `InstanceOfPatternMatching.java`
- [JEP 395:    Records](https://openjdk.java.net/jeps/395)
    - see example `Point.java`
- [JEP 396:    Strongly Encapsulate JDK Internals by Default](https://openjdk.java.net/jeps/396)
    - Strongly encapsulate all internal elements of the JDK by default, except for critical internal APIs such as
      sun.misc.Unsafe. Allow end users to choose the relaxed strong encapsulation that has been the default since JDK 9.
- [JEP 397:    Sealed Classes (Second Preview)](https://openjdk.java.net/jeps/397)
    - see example `Option.java` or `Shape.java`

##### Other References

- https://openjdk.java.net/projects/jdk/16/