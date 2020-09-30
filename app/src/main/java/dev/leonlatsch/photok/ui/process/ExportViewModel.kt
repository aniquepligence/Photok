/*
 *   Copyright 2020 Leon Latsch
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

package dev.leonlatsch.photok.ui.process

import android.net.Uri
import dev.leonlatsch.photok.model.database.entity.Photo
import dev.leonlatsch.photok.ui.process.base.BaseProcessViewModel
import dev.leonlatsch.photok.ui.process.base.ProcessState

class ExportViewModel : BaseProcessViewModel() {

    lateinit var photos: List<Photo>
    lateinit var dir: Uri

    override suspend fun process() {
        for (photo in photos) {
            if (processState.value == ProcessState.ABORTED) {
                return
            }
        }
    }
}