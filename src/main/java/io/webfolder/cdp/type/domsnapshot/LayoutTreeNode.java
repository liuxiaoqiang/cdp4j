/**
 * The MIT License
 * Copyright © 2017 WebFolder OÜ
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package io.webfolder.cdp.type.domsnapshot;

import io.webfolder.cdp.type.css.InlineTextBox;
import io.webfolder.cdp.type.dom.Rect;
import java.util.ArrayList;
import java.util.List;

/**
 * Details of an element in the DOM tree with a LayoutObject
 */
public class LayoutTreeNode {
    private Integer domNodeIndex;

    private Rect boundingBox;

    private String layoutText;

    private List<InlineTextBox> inlineTextNodes = new ArrayList<>();

    private Integer styleIndex;

    /**
     * The index of the related DOM node in the <code>domNodes</code> array returned by <code>getSnapshot</code>.
     */
    public Integer getDomNodeIndex() {
        return domNodeIndex;
    }

    /**
     * The index of the related DOM node in the <code>domNodes</code> array returned by <code>getSnapshot</code>.
     */
    public void setDomNodeIndex(Integer domNodeIndex) {
        this.domNodeIndex = domNodeIndex;
    }

    /**
     * The absolute position bounding box.
     */
    public Rect getBoundingBox() {
        return boundingBox;
    }

    /**
     * The absolute position bounding box.
     */
    public void setBoundingBox(Rect boundingBox) {
        this.boundingBox = boundingBox;
    }

    /**
     * Contents of the LayoutText, if any.
     */
    public String getLayoutText() {
        return layoutText;
    }

    /**
     * Contents of the LayoutText, if any.
     */
    public void setLayoutText(String layoutText) {
        this.layoutText = layoutText;
    }

    /**
     * The post-layout inline text nodes, if any.
     */
    public List<InlineTextBox> getInlineTextNodes() {
        return inlineTextNodes;
    }

    /**
     * The post-layout inline text nodes, if any.
     */
    public void setInlineTextNodes(List<InlineTextBox> inlineTextNodes) {
        this.inlineTextNodes = inlineTextNodes;
    }

    /**
     * Index into the <code>computedStyles</code> array returned by <code>getSnapshot</code>.
     */
    public Integer getStyleIndex() {
        return styleIndex;
    }

    /**
     * Index into the <code>computedStyles</code> array returned by <code>getSnapshot</code>.
     */
    public void setStyleIndex(Integer styleIndex) {
        this.styleIndex = styleIndex;
    }
}
