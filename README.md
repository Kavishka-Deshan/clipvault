# ClipCycle

A filmstrip-style clipboard manager built for the PDSA (Data Structures &
Algorithms) coursework.  The core data structure is a **hand-written Doubly
Linked List** — no `java.util.LinkedList` or other built-in linked structures
are used.

## Prerequisites

| Tool  | Version |
|-------|---------|
| JDK   | 17+     |
| Maven | 3.8+    |

## Quick start

```bash
# Compile and launch the JavaFX window
mvn clean javafx:run

# Run the data-structure unit tests
mvn test
```

## Package layout

```
src/main/java/com/clipcycle/
├── App.java              ← JavaFX entry point
├── model/                ← ClipboardNode, DoublyLinkedList (hand-written)
└── controller/           ← FXML controllers (call model, never touch pointers)

src/main/resources/com/clipcycle/
└── styles/clipcycle.css  ← filmstrip design-system stylesheet

src/test/java/com/clipcycle/
└── model/                ← JUnit 5 tests for the linked-list logic
```

## Licence

University coursework — not for redistribution.
