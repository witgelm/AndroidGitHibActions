FROM gradle:7.2.0-jdk11

MAINTAINER Viktor Filippov <witgelmfrost@gmail.com>


# Set up environment variables
ENV ANDROID_SDK_ROOT "/home/user/android-sdk-linux"
ENV SDK_URL "https://dl.google.com/android/repository/commandlinetools-linux-6609375_latest.zip"

# Create a non-root user
RUN useradd -m user
USER user
WORKDIR /home/user

# Download Android SDK
RUN mkdir "$ANDROID_SDK_ROOT" .android \
 && cd "$ANDROID_SDK_ROOT" \
 && mkdir cmdline-tools \
 && cd cmdline-tools \
 && curl -o sdk.zip $SDK_URL \
 && unzip sdk.zip \
 && rm sdk.zip \
 && cd .. \
 && yes | $ANDROID_SDK_ROOT/cmdline-tools/tools/bin/sdkmanager --licenses

ENV PATH="/home/user/gradle/bin:${ANDROID_SDK_ROOT}/platform-tools:${PATH}"

