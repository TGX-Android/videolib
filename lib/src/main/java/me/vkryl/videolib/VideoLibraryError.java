/*
 * This file is a part of VideoLibrary Interface
 * Copyright © Vyacheslav Krylov (slavone@protonmail.ch) 2021
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package me.vkryl.videolib;

import androidx.annotation.Nullable;

public class VideoLibraryError extends RuntimeException {
  /**
   * Numeric error code.
   */
  public final int code;

  /**
   * Unique error name that might be used as a suffix in the language pack to show.
   * Must match pattern: ^[A-Za-z0-9_]+$
   */
  public final String name;

  public VideoLibraryError (int code, String name, @Nullable Throwable cause) {
    super(name, cause);
    this.code = code;
    this.name = name;
  }
}