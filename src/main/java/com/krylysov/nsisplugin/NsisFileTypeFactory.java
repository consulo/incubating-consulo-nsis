package com.krylysov.nsisplugin;

import consulo.annotation.component.ExtensionImpl;
import consulo.virtualFileSystem.fileType.FileTypeConsumer;
import consulo.virtualFileSystem.fileType.FileTypeFactory;
import org.jetbrains.annotations.NotNull;

@ExtensionImpl
public class NsisFileTypeFactory extends FileTypeFactory {
    @Override
    public void createFileTypes(@NotNull FileTypeConsumer fileTypeConsumer) {
        fileTypeConsumer.consume(NsisFileType.INSTANCE, "nsi");
        fileTypeConsumer.consume(NsisFileType.INSTANCE, "nsh");
    }
}