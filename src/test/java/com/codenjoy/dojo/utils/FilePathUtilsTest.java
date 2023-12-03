package com.codenjoy.dojo.utils;

/*-
 * #%L
 * Codenjoy - it's a dojo-like platform from developers to developers.
 * %%
 * Copyright (C) 2012 - 2023 Codenjoy
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/gpl-3.0.html>.
 * #L%
 */


import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class FilePathUtilsTest {

    @Test
    public void shouldNormalisePath_whenWindowsPath() {
        assertEquals("path/to/file", FilePathUtils.normalize("path\\to\\file"));
    }

    @Test
    public void shouldNormalisePath_whenUnixPath() {
        assertEquals("path/to/file", FilePathUtils.normalize("path/to/file"));
    }

    @Test
    public void shouldNormalisePath_whenPathIsNull() {
        assertNull(FilePathUtils.normalize(null));
    }
}