/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.example.weibo;

/**
 *  This class is to make sure the
 */
public class Position {
    private final double latitude;
    private final double longitude;

    private final double delta;

    public Position(double latitude, double longitude, double delta) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.delta = delta;
    }

    public Position(double latitude, double longitude) {
        this(latitude, longitude, 0);
    }

    public boolean isNearBy(Position position) {
        return Math.abs(position.getLatitude() - latitude) < delta
            && Math.abs(position.getLongitude() - longitude) < delta;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public double getDelta() {
        return delta;
    }

    public String toString() {
        return "Position (" + latitude + "," + longitude + ")";
    }

}