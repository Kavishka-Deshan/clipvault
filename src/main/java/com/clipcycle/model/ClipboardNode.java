package com.clipcycle.model;

/**
 * A single node in the Copy List doubly linked list.
 *
 * Each node stores:
 *   - content : the text snippet the user added
 *   - prev    : reference to the preceding node (null if this is the head)
 *   - next    : reference to the following node  (null if this is the tail)
 *
 * Nodes never manage their own linking — CopyList is responsible for
 * wiring prev/next whenever a node is added, inserted, or deleted.
 */
public class ClipboardNode {

    private String content;
    private ClipboardNode prev;
    private ClipboardNode next;

    /**
     * Creates a new, unlinked node with the given text content.
     * Both prev and next default to null; CopyList will set them
     * when the node is placed in the chain.
     *
     * @param content the text this node carries
     */
    public ClipboardNode(String content) {
        this.content = content;
        this.prev = null;
        this.next = null;
    }

    // ── Content accessors ───────────────────────────────────────────

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    // ── Pointer accessors ───────────────────────────────────────────

    public ClipboardNode getPrev() {
        return prev;
    }

    public void setPrev(ClipboardNode prev) {
        this.prev = prev;
    }

    public ClipboardNode getNext() {
        return next;
    }

    public void setNext(ClipboardNode next) {
        this.next = next;
    }

    // ── Debug helper ────────────────────────────────────────────────

    @Override
    public String toString() {
        return "ClipboardNode{\"" + content + "\"}";
    }
}
