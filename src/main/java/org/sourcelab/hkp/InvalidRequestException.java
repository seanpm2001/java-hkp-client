/**
 * Copyright 2021 Stephen Powis https://github.com/sourcelaborg/java-hkp-client
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated
 * documentation files (the "Software"), to deal in the Software without restriction, including without limitation the
 * rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit
 * persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the
 * Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE
 * WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR
 * OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package org.sourcelab.hkp;

/**
 * Represents when a request is invalid.
 */
public class InvalidRequestException extends RuntimeException {
    private final int errorCode;

    /**
     * Constructor.
     * @param message Error message returned by server.
     * @param errorCode Error code returned by server.
     */
    public InvalidRequestException(final String message, final int errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    public InvalidRequestException(final String message, final Throwable cause) {
        super(message, cause);
        this.errorCode = -1;
    }

    public int getErrorCode() {
        return errorCode;
    }
}
