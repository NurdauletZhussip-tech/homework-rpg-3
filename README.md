Day 1:
Plans for that day is learning two patterns: 
Singletone and adapter patterns and integrate to our rpg game,
now im gonna watch 2-3 videos on youtube and analyze how i can integrate.
I watch a 3 videos abbout this patterns,understood Singleton and Adapter in a simple way.
Singleton is a pattern that allows only one object of a class in the whole program. At first, I did not understand why this is important. But then I learned that sometimes we need only one shared object, for example a configuration manager or a logger. If we create many objects, the program can have problems with different states. In Singleton, the constructor is private, so we cannot create an object with “new”. Instead, we use a special method like getInstance() that always returns the same object. For me, Singleton means “one class, one object”.
Adapter is different. It is used when two classes cannot work together because their interfaces are different. In the video, the teacher compared it to a plug adapter. If you travel to another country and your charger does not fit the socket, you use an adapter. In programming, we do the same. We create a new class that connects two incompatible classes. The Adapter implements the interface that we need and inside it calls methods of the old class. So we do not change the old code, but we make it compatible. For me, Adapter means “a bridge between two different classes”.
So, Singleton controls how many objects we create, and Adapter helps different classes work together.

End of day 1:
It was the way easier to understand than first homeworks.
In the course of this homework, I gained hands-on experience with software architecture and object-oriented design principles. Specifically:
**Mastered the Singleton Pattern:**
    I learned how to enforce a "single source of truth" in an application. By restricting the `BattleEngine` constructor, I understood how to prevent inconsistent game states and manage global resources (like the random number generator) effectively.
**Applied the Adapter Pattern:**
    I faced the real-world problem of integrating incompatible "legacy" code (`Hero` vs `Enemy`). Instead of rewriting working classes (which could introduce bugs), I learned to build wrappers (`Adapters`). This taught me the importance of the **Open/Closed Principle**—extending functionality without modifying existing code.

