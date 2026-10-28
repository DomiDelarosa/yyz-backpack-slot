# YYZ Backpack Slot

A Minecraft Fabric compatibility mod that adds a dedicated backpack slot to [YYZ's Backpack](https://modrinth.com/) using Trinkets Updated.

## Features

- Adds a dedicated slot for backpacks.
- Integrates with Trinkets Updated.
- Allows compatible backpacks to be equipped in the dedicated slot.

## Requirements

- Minecraft 26.3
- Fabric Loader
- Trinkets Updated
- YYZ's Backpack

> Make sure all required mods are compatible with your Minecraft version.

## Installation

1. Install Fabric Loader for your Minecraft version.
2. Install Trinkets Updated and YYZ's Backpack.
3. Download the latest `yyz-backpack-slot` release.
4. Place the downloaded `.jar` file in your Minecraft `mods` folder.
5. Launch Minecraft.

## Building from Source

You can build the mod locally using the Gradle wrapper.

### Requirements

- JDK 25 or a compatible Java version required by the project.
- Git (optional, for cloning the repository).

### Build

Clone the repository:

```bash
git clone https://github.com/DomiDelarosa/yyz-backpack-slot.git
cd yyz-backpack-slot
```

Build the mod:

**Windows (PowerShell):**

```powershell
.\gradlew.bat build
```

**Linux/macOS:**

```bash
./gradlew build
```

The compiled JAR files will be generated in:

```text
build/libs/
```

Use the regular `.jar` file, not the `-sources.jar` file, to install the mod.

## Compatibility

This mod is intended to provide compatibility between YYZ's Backpack and Trinkets Updated by adding a dedicated backpack equipment slot.

Compatibility depends on the versions of Minecraft, Fabric Loader, Trinkets Updated, and YYZ's Backpack being used.

## License

See the [LICENSE](LICENSE) file for license information.