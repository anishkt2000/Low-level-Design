package Principles;

public class DependencyInversion {
    // class should depend upon interfaces or abstractions, not on concrete implementations.
    // This principle helps to reduce the coupling between classes and makes the codebase more flexible and easier to maintain.
    // High-level modules should not depend on low-level modules. Both should depend on abstractions


//    class MacBook{
//        private final WiredKeyboard keyboard;
//        private final WiredMouse mouse;
//
//        public MacBook() {
//            this.keyboard = new WiredKeyboard();
//            this.mouse = new WiredMouse();
//            // MacBook is tightly coupled with WiredKeyboard and WiredMouse
//            // If we want to use a different keyboard or mouse, we need to modify this class
//        }
//    }

    interface Keyboard{
        public void type();
    }
    interface Mouse{
        public void click();
    }

    class MacBookNew{
        private final Keyboard keyboard;
        private final Mouse mouse;

        public MacBookNew(Keyboard keyboard, Mouse mouse) {
            this.keyboard = keyboard;
            this.mouse = mouse;
            // MacBook is now dependent on abstractions (Keyboard and Mouse)
            // We can pass any implementation of Keyboard and Mouse to this class
        }
    }
}
