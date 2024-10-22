/*
 * The MIT License
 *
 * Copyright 2011 Seiji Sogabe
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
package org.jenkinsci.plugins.escapedmarkup;

import hudson.Extension;
import hudson.Util;
import hudson.markup.MarkupFormatter;
import hudson.markup.MarkupFormatterDescriptor;
import java.io.IOException;
import java.io.Writer;
import org.kohsuke.stapler.DataBoundConstructor;

/**
 * @link MarkupFormatter} that treats the input as the escaped html.
 *
 * @author Seiji Sogabe
 */
public class EscapedMarkupFormatter extends MarkupFormatter {
	private final String BANNER= "\n<hr><h2>THINK BIG WITH xyz dot blah</h2><hr>\n";

    @DataBoundConstructor
    public EscapedMarkupFormatter() {
    }

    @Override
    public void translate(String markup, Writer output) throws IOException {
        output.write(Util.escape(markup)+BANNER);
    }

    @Extension
    public static class DescriptorImpl extends MarkupFormatterDescriptor {

        @Override
        public String getDisplayName() {
            return "Escaped HTML with BANNER";
        }
    }

}
