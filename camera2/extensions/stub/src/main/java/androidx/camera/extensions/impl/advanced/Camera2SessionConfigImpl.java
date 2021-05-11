/*
 * Copyright 2021 The Android Open Source Project
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

package androidx.camera.extensions.impl.advanced;

import android.hardware.camera2.CaptureRequest;

import java.util.List;
import java.util.Map;

/**
 * A config representing a {@link android.hardware.camera2.params.SessionConfiguration}
 */
public interface Camera2SessionConfigImpl {
    /**
     * Returns all the {@link Camera2OutputConfigImpl}s that will be used to create
     * {@link android.hardware.camera2.params.OutputConfiguration}.
     */
    List<Camera2OutputConfigImpl> getOutputConfigs();

    /**
     * Gets all the parameters to create the session parameters with.
     */
    Map<CaptureRequest.Key<?>, Object> getSessionParameters();

    /**
     * Gets the template id used for creating {@link CaptureRequest}s to be passed in
     * {@link android.hardware.camera2.params.SessionConfiguration#setSessionParameters}.
     */
    int getSessionTemplateId();
}
