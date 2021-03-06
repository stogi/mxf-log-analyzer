package com.stogiapps.mxfloganalyzer

import groovy.transform.PackageScope

@PackageScope
final class MxfLogAnalyzerUnitSpecExamples {

    static final LOG_CONTENT_1 =
'''
08:46:02.581 (0) GMT Jul 5, 2017 Signiant Supervisor V11.4.0[70633] (logbase: WeatherToPlayout-Weather_World_from_H_to_EricssonPlayout.26694) starts on lmc01n02.national.core.bbc.co.uk
  The Signiant supervisor V11.4.0[70633] (logbase: WeatherToPlayout-Weather_World_from_H_to_EricssonPlayout.26694).
08:46:02.582 (0) Extracting context 'admin+Media_Mover_workflow_DualDelivery_FoldersOption' 'MediaDropBox\'
  SCHD_CTRL_PORT=45051
  Execution counts - groups: 18. links: 0, job components: 11
08:46:03.430 (4) Starting group: MediaDropBox (decision)
08:46:03.631 (4) Starting group: MediaDropBox.GROUP_FileList (decision)
08:46:03.632 (4) Executing component instance 'MediaDropBox.GROUP_FileList.FileList' property mapping command
08:46:03.673 (7) Adding package variable: Inputs.Source=\'\'
08:46:03.673 (7) Adding package variable: Inputs.Source.tgt_node_list='WeatherAgents!9\'
08:46:03.673 (7) Adding package variable: Inputs.Source.SourcePaths='/mnt/staging2/clip.dir/Transfers/TransferSigniantEricssonWorld\'
08:46:03.673 (7) Adding package variable: Inputs.Source.IncludeFiles='*.mxf,*.xml,*.m2v,*.wav,*.aiff,*.mov\'
08:46:03.673 (7) Adding package variable: Inputs.Source.ExcludeFiles=\'\'
08:46:03.673 (7) Adding package variable: Inputs.Source.ExcludeSubdirectories='None\'
08:46:03.673 (7) Adding package variable: Inputs.Source.ExcludeSubDirList=\'\'
08:46:03.673 (7) Adding package variable: Inputs.Source.FileReadinessCheckType='Consecutive Seek\'
08:46:03.673 (7) Adding package variable: Inputs.Source.FileReadinessCheckDelay='10\'
08:46:03.673 (7) Adding package variable: Inputs.Source.tgt_user='%dds_default_user%\'
08:46:03.673 (7) Adding package variable: Inputs.Source.fileDate=\'\'
08:46:03.673 (7) Adding package variable: Inputs.Transport=\'\'
08:46:03.673 (7) Adding package variable: Inputs.Options=\'\'
08:46:03.792 (4) Starting job component: MediaDropBox.GROUP_FileList.FileList
08:46:04.104 (7) Message from sig01vip.national.core.bbc.co.uk - Command control agent [MediaDropBox.GROUP_FileList.FileList]:
    The channel to lmmrly2803.fabric.bbc.co.uk is mutually authenticated (Cipher=AES256-SHA, Keysize=256/256).
08:46:04.277 (7) Message from sig01vip.national.core.bbc.co.uk - Command control agent [MediaDropBox.GROUP_FileList.FileList]:
    The channel to lmmrly2803.fabric.bbc.co.uk is mutually authenticated (Cipher=AES256-SHA, Keysize=256/256).
08:46:04.278 (7) Message from lmmrly2803.fabric.bbc.co.uk - Command agent [MediaDropBox.GROUP_FileList.FileList]:
    The channel from sig01vip.national.core.bbc.co.uk is mutually authenticated (Cipher=AES256-SHA, Keysize=256/256).
08:46:04.430 (7) Message from lmmrly2803.fabric.bbc.co.uk - Target initialization command [MediaDropBox.GROUP_FileList.FileList]:
    Executing FileList component: FileList
08:46:04.430 (7) Message from lmmrly2803.fabric.bbc.co.uk - Target initialization command [MediaDropBox.GROUP_FileList.FileList]:
    DdsSourceTempDir=/tmp
08:46:08.516 (7) Message from lmmrly2803.fabric.bbc.co.uk - Target process command [MediaDropBox.GROUP_FileList.FileList]:
    Generating File List...
08:46:08.516 (7) SourceAgent: [lmmrly2803.fabric.bbc.co.uk]
08:46:08.517 (7) SourceAgentPlatform: [x86_64-Linux-RH5]
08:46:08.518 (7) SourceAgentUserid: [root]
08:46:08.518 (7) SourceHost: [WeatherAgents!9]
08:46:08.518 (7) SourcePaths: [/mnt/staging2/clip.dir/Transfers/TransferSigniantEricssonWorld]
08:46:08.518 (7) IncludeFiles: [*.mxf,*.xml,*.m2v,*.wav,*.aiff,*.mov]
08:46:08.518 (7) ExcludeFiles: []
08:46:08.518 (7) ExcludeSubdirectories: [None]
08:46:08.519 (7) ExcludeSubDirList: []
08:46:08.519 (7) FileReadinessCheckType: [Consecutive Seek]
08:46:08.519 (7) FileReadinessCheckDelay: [10]
08:46:18.618 (7) Message from lmmrly2803.fabric.bbc.co.uk - Target agent completion command [MediaDropBox.GROUP_FileList.FileList]:

08:46:18.774 (4) Finished job component: MediaDropBox.GROUP_FileList.FileList
08:46:18.927 (4) Starting group:    MediaDropBox.GROUP_FileList.Group (concurrent).
08:46:18.927 (4) Starting group: MediaDropBox.GROUP_FileList.Group.Transfer_1 (decision)
08:46:18.969 (4) Starting group: MediaDropBox.GROUP_FileList.Group.Transfer_2 (decision)
08:46:19.125 (4) Starting group: MediaDropBox.GROUP_FileList.Group.Transfer_1.GROUP_FileListToManifest1 (decision)
08:46:19.125 (4) Executing component instance 'MediaDropBox.GROUP_FileList.Group.Transfer_1.GROUP_FileListToManifest1.FileListToManifest1' property mapping command
08:46:19.248 (7) Adding package variable: Inputs.Source=\'\'
08:46:19.248 (7) Adding package variable: Inputs.Source.tgt_node_list='WeatherAgents!9\'
08:46:19.248 (7) Adding package variable: Inputs.Source.baseFolder='/mnt/staging2/clip.dir/Transfers/TransferSigniantEricssonWorld\'
08:46:19.248 (7) Adding package variable: Inputs.Source.SourcePaths='/mnt/staging2/clip.dir/Transfers/TransferSigniantEricssonWorld\'
08:46:19.248 (7) Adding package variable: Inputs.Source.IncludeFiles='*.mxf,*.xml,*.m2v,*.wav,*.aiff,*.mov\'
08:46:19.248 (7) Adding package variable: Inputs.Source.ExcludeFiles=\'\'
08:46:19.248 (7) Adding package variable: Inputs.Source.ExcludeSubdirectories='None\'
08:46:19.249 (7) Adding package variable: Inputs.Source.ExcludeSubDirList=\'\'
08:46:19.249 (7) Adding package variable: Inputs.Source.fileDateFilter=\'\'
08:46:19.249 (7) Adding package variable: Inputs.Source.FileReadinessCheckType='None\'
08:46:19.249 (7) Adding package variable: Inputs.Source.FileReadinessCheckDelay='0\'
08:46:19.249 (7) Adding package variable: Inputs.Source.tgt_user='%dds_default_user%\'
08:46:19.249 (7) Adding package variable: Inputs.Source.includeFoldersinOutputList='no\'
08:46:19.249 (7) Adding package variable: Inputs.Source.outputManifestFile='no\'
08:46:19.249 (7) Adding package variable: Inputs.Transport=\'\'
08:46:19.249 (7) Adding package variable: Inputs.Options=\'\'
08:46:19.359 (4) Starting group: MediaDropBox.GROUP_FileList.Group.Transfer_2.GROUP_FileListToManifest2 (decision)
08:46:19.359 (4) Executing component instance 'MediaDropBox.GROUP_FileList.Group.Transfer_2.GROUP_FileListToManifest2.FileListToManifest2' property mapping command
08:46:19.399 (7) Adding package variable: Inputs.Source=\'\'
08:46:19.399 (7) Adding package variable: Inputs.Source.tgt_node_list='WeatherAgents!9\'
08:46:19.399 (7) Adding package variable: Inputs.Source.baseFolder='/mnt/staging2/clip.dir/Transfers/TransferSigniantEricssonWorld\'
08:46:19.399 (7) Adding package variable: Inputs.Source.SourcePaths='/mnt/staging2/clip.dir/Transfers/TransferSigniantEricssonWorld\'
08:46:19.399 (7) Adding package variable: Inputs.Source.IncludeFiles='*.mxf,*.xml,*.m2v,*.wav,*.aiff,*.mov\'
08:46:19.399 (7) Adding package variable: Inputs.Source.ExcludeFiles=\'\'
08:46:19.399 (7) Adding package variable: Inputs.Source.ExcludeSubdirectories='None\'
08:46:19.399 (7) Adding package variable: Inputs.Source.ExcludeSubDirList=\'\'
08:46:19.399 (7) Adding package variable: Inputs.Source.fileDateFilter=\'\'
08:46:19.399 (7) Adding package variable: Inputs.Source.FileReadinessCheckType='None\'
08:46:19.399 (7) Adding package variable: Inputs.Source.FileReadinessCheckDelay='0\'
08:46:19.399 (7) Adding package variable: Inputs.Source.tgt_user='%dds_default_user%\'
08:46:19.399 (7) Adding package variable: Inputs.Source.includeFoldersinOutputList='no\'
08:46:19.399 (7) Adding package variable: Inputs.Source.outputManifestFile='no\'
08:46:19.399 (7) Adding package variable: Inputs.Transport=\'\'
08:46:19.399 (7) Adding package variable: Inputs.Options=\'\'
08:46:19.512 (4) Starting job component: MediaDropBox.GROUP_FileList.Group.Transfer_1.GROUP_FileListToManifest1.FileListToManifest1
08:46:19.818 (7) Message from sig01vip.national.core.bbc.co.uk - Command control agent [MediaDropBox.GROUP_FileList.Group.Transfer_1.GROUP_FileListToManifest1.FileListToManifest1]:
    The channel to lmmrly2803.fabric.bbc.co.uk is mutually authenticated (Cipher=AES256-SHA, Keysize=256/256).
08:46:19.890 (4) Starting job component: MediaDropBox.GROUP_FileList.Group.Transfer_2.GROUP_FileListToManifest2.FileListToManifest2
08:46:19.981 (7) Message from sig01vip.national.core.bbc.co.uk - Command control agent [MediaDropBox.GROUP_FileList.Group.Transfer_1.GROUP_FileListToManifest1.FileListToManifest1]:
    The channel to lmmrly2803.fabric.bbc.co.uk is mutually authenticated (Cipher=AES256-SHA, Keysize=256/256).
08:46:19.982 (7) Message from lmmrly2803.fabric.bbc.co.uk - Command agent [MediaDropBox.GROUP_FileList.Group.Transfer_1.GROUP_FileListToManifest1.FileListToManifest1]:
    The channel from sig01vip.national.core.bbc.co.uk is mutually authenticated (Cipher=AES256-SHA, Keysize=256/256).
08:46:20.061 (7) Message from lmmrly2803.fabric.bbc.co.uk - Target initialization command [MediaDropBox.GROUP_FileList.Group.Transfer_1.GROUP_FileListToManifest1.FileListToManifest1]:
    Executing FileList component: FileListToManifest1
08:46:20.190 (7) Message from sig01vip.national.core.bbc.co.uk - Command control agent [MediaDropBox.GROUP_FileList.Group.Transfer_2.GROUP_FileListToManifest2.FileListToManifest2]:
    The channel to lmmrly2804.fabric.bbc.co.uk is mutually authenticated (Cipher=AES256-SHA, Keysize=256/256).
08:46:20.385 (7) Message from sig01vip.national.core.bbc.co.uk - Command control agent [MediaDropBox.GROUP_FileList.Group.Transfer_2.GROUP_FileListToManifest2.FileListToManifest2]:
    The channel to lmmrly2804.fabric.bbc.co.uk is mutually authenticated (Cipher=AES256-SHA, Keysize=256/256).
08:46:20.387 (7) Message from lmmrly2804.fabric.bbc.co.uk - Command agent [MediaDropBox.GROUP_FileList.Group.Transfer_2.GROUP_FileListToManifest2.FileListToManifest2]:
    The channel from sig01vip.national.core.bbc.co.uk is mutually authenticated (Cipher=AES256-SHA, Keysize=256/256).
08:46:20.469 (7) Message from lmmrly2804.fabric.bbc.co.uk - Target initialization command [MediaDropBox.GROUP_FileList.Group.Transfer_2.GROUP_FileListToManifest2.FileListToManifest2]:
    Executing FileList component: FileListToManifest2
08:46:23.543 (7) Message from lmmrly2804.fabric.bbc.co.uk - Target process command [MediaDropBox.GROUP_FileList.Group.Transfer_2.GROUP_FileListToManifest2.FileListToManifest2]:
    Generating File List...
08:46:23.543 (7) SourceAgent: [lmmrly2804.fabric.bbc.co.uk]
08:46:23.544 (7) SourceAgentPlatform: [x86_64-Linux-RH5]
08:46:23.544 (7) SourceAgentUserid: [root]
08:46:23.544 (7) SourceHost: [WeatherAgents!9]
08:46:23.544 (7) SourcePaths: [/mnt/staging2/clip.dir/Transfers/TransferSigniantEricssonWorld]
08:46:23.544 (7) IncludeFiles: [*.mxf,*.xml,*.m2v,*.wav,*.aiff,*.mov]
08:46:23.545 (7) ExcludeFiles: []
08:46:23.545 (7) ExcludeSubdirectories: [None]
08:46:23.545 (7) ExcludeSubDirList: []
08:46:23.545 (7) FileReadinessCheckType: [None]
08:46:23.545 (7) FileReadinessCheckDelay: [0]
08:46:23.752 (4) Finished job component: MediaDropBox.GROUP_FileList.Group.Transfer_2.GROUP_FileListToManifest2.FileListToManifest2
08:46:23.925 (4) Starting group: MediaDropBox.GROUP_FileList.Group.Transfer_2.GROUP_FileListToManifest2.GROUP_Transfer_2_nosubfolder (decision)
08:46:23.927 (4) Executing component instance 'MediaDropBox.GROUP_FileList.Group.Transfer_2.GROUP_FileListToManifest2.GROUP_Transfer_2_nosubfolder.Transfer_2_nosubfolder' property mapping command
08:46:23.978 (7) Adding package variable: Inputs.Source=\'\'
08:46:23.978 (7) Adding package variable: Inputs.Source.src_node_list='WeatherAgents!9\'
08:46:23.978 (7) Adding package variable: Inputs.Source.SourceData='<SIGLIST TYPE='PATHLIST' XATTRS='/mnt/staging2/clip.dir/Transfers/TransferSigniantEricssonWorld' ><EL S='3252964112' T='F' MT='2017-07-05T08:33:27Z' V='/mnt/staging2/clip.dir/Transfers/TransferSigniantEricssonWorld/WEBF2717_VA22_GEN_2017_07_05_09-29-16/WEBF2717_VA22_GEN.mxf' /><EL S='1621' T='F' MT='2017-07-05T08:33:42Z' V='/mnt/staging2/clip.dir/Transfers/TransferSigniantEricssonWorld/WEBF2717_VA22_GEN_2017_07_05_09-29-16/WEBF2717_VA22_GEN.xml' /> </SIGLIST>\'
08:46:23.978 (7) Adding package variable: Inputs.Source.IncludeFiles='*.mxf,*.xml,*.m2v,*.wav,*.aiff,*.mov\'
08:46:23.978 (7) Adding package variable: Inputs.Source.ExcludeFiles=\'\'
08:46:23.979 (7) Adding package variable: Inputs.Source.ExcludeSubdirectories='None\'
08:46:23.979 (7) Adding package variable: Inputs.Source.ExcludeSubDirList=\'\'
08:46:23.979 (7) Adding package variable: Inputs.Source.FileReadinessCheckType='None\'
08:46:23.979 (7) Adding package variable: Inputs.Source.FileReadinessCheckDelay='0\'
08:46:23.979 (7) Adding package variable: Inputs.Source.SourceDeletionsPostTransfer='none\'
08:46:23.979 (7) Adding package variable: Inputs.Source.SourceDeletionExcludeDirectories=\'\'
08:46:23.979 (7) Adding package variable: Inputs.Source.src_user='%dds_default_user%\'
08:46:23.979 (7) Adding package variable: Inputs.Target=\'\'
08:46:23.979 (7) Adding package variable: Inputs.Target.tgt_node_list='Ericsson_South!9\'
08:46:23.979 (7) Adding package variable: Inputs.Target.TargetDirectory='/stornext/WP_MG_INCOMING/BBC/BBC_WORLD_NEWS/PROGRAMMES/SIDECAR/NORMAL\'
08:46:23.979 (7) Adding package variable: Inputs.Target.PathMappingOptions=\'\'
08:46:23.979 (7) Adding package variable: Inputs.Target.maximumJobDateTimeDirectories='10\'
08:46:23.979 (7) Adding package variable: Inputs.Target.RemoveTargetFiles='no\'
08:46:23.979 (7) Adding package variable: Inputs.Target.removeExpiredDirsonTarget='no\'
08:46:23.979 (7) Adding package variable: Inputs.Target.RemoveOlderThan='30\'
08:46:23.979 (7) Adding package variable: Inputs.Target.tgt_user='%dds_default_user%\'
08:46:23.979 (7) Adding package variable: Inputs.Target.discardSubFolders='yes\'
08:46:23.979 (7) Adding package variable: Inputs.Transport=\'\'
08:46:23.979 (7) Adding package variable: Inputs.Transport.udp_transfer='yes\'
08:46:23.980 (7) Adding package variable: Inputs.Transport.udp_aggressiveness='medium\'
08:46:23.980 (7) Adding package variable: Inputs.Transport.throughput_tgt='0\'
08:46:23.980 (7) Adding package variable: Inputs.Transport.bw_floor='0\'
08:46:23.980 (7) Adding package variable: Inputs.Transport.bw_throttle=\'\'
08:46:23.980 (7) Adding package variable: Inputs.Transport.bw_throttle_tod='00:00;00:00;YYYYYYY;0;\'
08:46:23.980 (7) Adding package variable: Inputs.Options=\'\'
08:46:23.980 (7) Adding package variable: Inputs.Options.certified_delivery='unsigned\'
08:46:23.980 (7) Adding package variable: Inputs.Options.check_type='timesize\'
08:46:23.980 (7) Adding package variable: Inputs.Options.compression='no\'
08:46:23.980 (7) Adding package variable: Inputs.Options.follow_symlinks='yes\'
08:46:23.980 (7) Adding package variable: Inputs.Options.transferFilesInSortedOrder='yes\'
08:46:23.980 (7) Adding package variable: Inputs.Options.rsync='no\'
08:46:23.980 (7) Adding package variable: Inputs.Options.src_file_inuse_action='error\'
08:46:23.980 (7) Adding package variable: Inputs.Options.synchronize='no\'
08:46:23.980 (7) Adding package variable: Inputs.Options.tgt_file_inuse_action='error\'
08:46:23.980 (7) Adding package variable: Inputs.Options.RemoveParentFolder='yes\'
08:46:23.980 (7) Adding package variable: Inputs.Options.verifyforsufficientdiskspacebeforeJobtransfersstart='no\'
08:46:23.980 (7) Adding package variable: Inputs.Options.verifytargetdirectoryexists='no\'
08:46:24.137 (4) Starting job component: MediaDropBox.GROUP_FileList.Group.Transfer_2.GROUP_FileListToManifest2.GROUP_Transfer_2_nosubfolder.Transfer_2_nosubfolder [(lmmrly2803.fabric.bbc.co.uk lmmrly2804.fabric.bbc.co.uk)]
08:46:24.262 (7) Message from lmmrly2803.fabric.bbc.co.uk - Target process command [MediaDropBox.GROUP_FileList.Group.Transfer_1.GROUP_FileListToManifest1.FileListToManifest1]:
    Generating File List...
08:46:24.262 (7) SourceAgent: [lmmrly2803.fabric.bbc.co.uk]
08:46:24.262 (7) SourceAgentPlatform: [x86_64-Linux-RH5]
08:46:24.263 (7) SourceAgentUserid: [root]
08:46:24.263 (7) SourceHost: [WeatherAgents!9]
08:46:24.263 (7) SourcePaths: [/mnt/staging2/clip.dir/Transfers/TransferSigniantEricssonWorld]
08:46:24.263 (7) IncludeFiles: [*.mxf,*.xml,*.m2v,*.wav,*.aiff,*.mov]
08:46:24.263 (7) ExcludeFiles: []
08:46:24.263 (7) ExcludeSubdirectories: [None]
08:46:24.263 (7) ExcludeSubDirList: []
08:46:24.263 (7) FileReadinessCheckType: [None]
08:46:24.263 (7) FileReadinessCheckDelay: [0]
08:46:24.298 (7) Message from lmmrly2803.fabric.bbc.co.uk - File agent [MediaDropBox.GROUP_FileList.Group.Transfer_2.GROUP_FileListToManifest2.GROUP_Transfer_2_nosubfolder.Transfer_2_nosubfolder]:
    The channel from sig01vip.national.core.bbc.co.uk is mutually authenticated (Cipher=AES256-SHA, Keysize=256/256).
08:46:24.350 (7) Message from lmmrly2803.fabric.bbc.co.uk - Source file agent [MediaDropBox.GROUP_FileList.Group.Transfer_2.GROUP_FileListToManifest2.GROUP_Transfer_2_nosubfolder.Transfer_2_nosubfolder]:
    The maximum concurrent agent count has been reduced from 8 to 5 because lmmrly2803 only supports 64 threads per process.
08:46:24.446 (7) Message from lmmrly2803.fabric.bbc.co.uk - Source initialization command [MediaDropBox.GROUP_FileList.Group.Transfer_2.GROUP_FileListToManifest2.GROUP_Transfer_2_nosubfolder.Transfer_2_nosubfolder]:
    Executing SigniantDistribute component: Transfer_2_nosubfolder
08:46:24.466 (7) Message from lmmrly2803.fabric.bbc.co.uk - Source initialization command [MediaDropBox.GROUP_FileList.Group.Transfer_2.GROUP_FileListToManifest2.GROUP_Transfer_2_nosubfolder.Transfer_2_nosubfolder]:
    JobDateTimeStamp: [17-07-05_08-46-24.06063]
08:46:24.467 (7) Message from lmmrly2803.fabric.bbc.co.uk - Source initialization command [MediaDropBox.GROUP_FileList.Group.Transfer_2.GROUP_FileListToManifest2.GROUP_Transfer_2_nosubfolder.Transfer_2_nosubfolder]:
    SourceAgent: [lmmrly2803.fabric.bbc.co.uk]
08:46:24.467 (7) Message from lmmrly2803.fabric.bbc.co.uk - Source initialization command [MediaDropBox.GROUP_FileList.Group.Transfer_2.GROUP_FileListToManifest2.GROUP_Transfer_2_nosubfolder.Transfer_2_nosubfolder]:
    SourceAgentPlatform: [x86_64-Linux-RH5]
08:46:24.467 (7) Message from lmmrly2803.fabric.bbc.co.uk - Source initialization command [MediaDropBox.GROUP_FileList.Group.Transfer_2.GROUP_FileListToManifest2.GROUP_Transfer_2_nosubfolder.Transfer_2_nosubfolder]:
    SourceAgentUserid: [root]
08:46:24.467 (7) Message from lmmrly2803.fabric.bbc.co.uk - Source initialization command [MediaDropBox.GROUP_FileList.Group.Transfer_2.GROUP_FileListToManifest2.GROUP_Transfer_2_nosubfolder.Transfer_2_nosubfolder]:
    SourceHost: [WeatherAgents!9]
08:46:24.467 (7) Message from lmmrly2803.fabric.bbc.co.uk - Source initialization command [MediaDropBox.GROUP_FileList.Group.Transfer_2.GROUP_FileListToManifest2.GROUP_Transfer_2_nosubfolder.Transfer_2_nosubfolder]:
    SourceData: [/mnt/staging2/clip.dir/Transfers/TransferSigniantEricssonWorld/WEBF2717_VA22_GEN_2017_07_05_09-29-16/WEBF2717_VA22_GEN.mxf,/mnt/staging2/clip.dir/Transfers/TransferSigniantEricssonWorld/WEBF2717_VA22_GEN_2017_07_05_09-29-16/WEBF2717_VA22_GEN.xml]
08:46:24.467 (7) Message from lmmrly2803.fabric.bbc.co.uk - Source initialization command [MediaDropBox.GROUP_FileList.Group.Transfer_2.GROUP_FileListToManifest2.GROUP_Transfer_2_nosubfolder.Transfer_2_nosubfolder]:
    IncludeFiles: [*.mxf,*.xml,*.m2v,*.wav,*.aiff,*.mov]
08:46:24.467 (7) Message from lmmrly2803.fabric.bbc.co.uk - Source initialization command [MediaDropBox.GROUP_FileList.Group.Transfer_2.GROUP_FileListToManifest2.GROUP_Transfer_2_nosubfolder.Transfer_2_nosubfolder]:
    ExcludeFiles: []
08:46:24.467 (7) Message from lmmrly2803.fabric.bbc.co.uk - Source initialization command [MediaDropBox.GROUP_FileList.Group.Transfer_2.GROUP_FileListToManifest2.GROUP_Transfer_2_nosubfolder.Transfer_2_nosubfolder]:
    ExcludeSubdirectories: [None]
08:46:24.467 (7) Message from lmmrly2803.fabric.bbc.co.uk - Source initialization command [MediaDropBox.GROUP_FileList.Group.Transfer_2.GROUP_FileListToManifest2.GROUP_Transfer_2_nosubfolder.Transfer_2_nosubfolder]:
    ExcludeSubDirList: []
08:46:24.467 (7) Message from lmmrly2803.fabric.bbc.co.uk - Source initialization command [MediaDropBox.GROUP_FileList.Group.Transfer_2.GROUP_FileListToManifest2.GROUP_Transfer_2_nosubfolder.Transfer_2_nosubfolder]:
    TargetHosts: [Ericsson_South!9]
08:46:24.468 (7) Message from lmmrly2803.fabric.bbc.co.uk - Source initialization command [MediaDropBox.GROUP_FileList.Group.Transfer_2.GROUP_FileListToManifest2.GROUP_Transfer_2_nosubfolder.Transfer_2_nosubfolder]:
    TargetDirectory: [/stornext/WP_MG_INCOMING/BBC/BBC_WORLD_NEWS/PROGRAMMES/SIDECAR/NORMAL]
08:46:24.468 (7) Message from lmmrly2803.fabric.bbc.co.uk - Source initialization command [MediaDropBox.GROUP_FileList.Group.Transfer_2.GROUP_FileListToManifest2.GROUP_Transfer_2_nosubfolder.Transfer_2_nosubfolder]:
    PathMappingOptions: []
08:46:24.468 (7) Message from lmmrly2803.fabric.bbc.co.uk - Source initialization command [MediaDropBox.GROUP_FileList.Group.Transfer_2.GROUP_FileListToManifest2.GROUP_Transfer_2_nosubfolder.Transfer_2_nosubfolder]:
    SkipParentFolder: [yes]
08:46:24.468 (7) Message from lmmrly2803.fabric.bbc.co.uk - Source initialization command [MediaDropBox.GROUP_FileList.Group.Transfer_2.GROUP_FileListToManifest2.GROUP_Transfer_2_nosubfolder.Transfer_2_nosubfolder]:
    SourceDeletionsPostTransfer: [none]
08:46:24.468 (7) Message from lmmrly2803.fabric.bbc.co.uk - Source initialization command [MediaDropBox.GROUP_FileList.Group.Transfer_2.GROUP_FileListToManifest2.GROUP_Transfer_2_nosubfolder.Transfer_2_nosubfolder]:
    SourceDeletionExcludeDirectories: []
08:46:24.468 (7) Message from lmmrly2803.fabric.bbc.co.uk - Source initialization command [MediaDropBox.GROUP_FileList.Group.Transfer_2.GROUP_FileListToManifest2.GROUP_Transfer_2_nosubfolder.Transfer_2_nosubfolder]:
    RemoveTargetFiles: [no]
08:46:24.468 (7) Message from lmmrly2803.fabric.bbc.co.uk - Source initialization command [MediaDropBox.GROUP_FileList.Group.Transfer_2.GROUP_FileListToManifest2.GROUP_Transfer_2_nosubfolder.Transfer_2_nosubfolder]:
    RemoveTargetDirs: [no]
08:46:24.468 (7) Message from lmmrly2803.fabric.bbc.co.uk - Source initialization command [MediaDropBox.GROUP_FileList.Group.Transfer_2.GROUP_FileListToManifest2.GROUP_Transfer_2_nosubfolder.Transfer_2_nosubfolder]:
    RemoveOlderThan: [30]
08:46:24.468 (7) Message from lmmrly2803.fabric.bbc.co.uk - Source initialization command [MediaDropBox.GROUP_FileList.Group.Transfer_2.GROUP_FileListToManifest2.GROUP_Transfer_2_nosubfolder.Transfer_2_nosubfolder]:
    JobLogDetail: [INFO]
08:46:24.470 (7) Message from lmmrly2803.fabric.bbc.co.uk - Source initialization command [MediaDropBox.GROUP_FileList.Group.Transfer_2.GROUP_FileListToManifest2.GROUP_Transfer_2_nosubfolder.Transfer_2_nosubfolder]:
    MaximumBandwidthLimit: [00:00;00:00;YYYYYYY;0;]
08:46:24.470 (7) Message from lmmrly2803.fabric.bbc.co.uk - Source initialization command [MediaDropBox.GROUP_FileList.Group.Transfer_2.GROUP_FileListToManifest2.GROUP_Transfer_2_nosubfolder.Transfer_2_nosubfolder]:
    WANAcceleratorOn: [yes]
08:46:24.470 (7) Message from lmmrly2803.fabric.bbc.co.uk - Source initialization command [MediaDropBox.GROUP_FileList.Group.Transfer_2.GROUP_FileListToManifest2.GROUP_Transfer_2_nosubfolder.Transfer_2_nosubfolder]:
    WANAcceleratorAggressiveness: [medium]
08:46:24.471 (7) Message from lmmrly2803.fabric.bbc.co.uk - Source initialization command [MediaDropBox.GROUP_FileList.Group.Transfer_2.GROUP_FileListToManifest2.GROUP_Transfer_2_nosubfolder.Transfer_2_nosubfolder]:
    BandwidthCeiling: [0]
08:46:24.471 (7) Message from lmmrly2803.fabric.bbc.co.uk - Source initialization command [MediaDropBox.GROUP_FileList.Group.Transfer_2.GROUP_FileListToManifest2.GROUP_Transfer_2_nosubfolder.Transfer_2_nosubfolder]:
    BandwidthFloor: [0]
08:46:24.471 (7) Message from lmmrly2803.fabric.bbc.co.uk - Source initialization command [MediaDropBox.GROUP_FileList.Group.Transfer_2.GROUP_FileListToManifest2.GROUP_Transfer_2_nosubfolder.Transfer_2_nosubfolder]:
    CompressFiles: [no]
08:46:24.471 (7) Message from lmmrly2803.fabric.bbc.co.uk - Source initialization command [MediaDropBox.GROUP_FileList.Group.Transfer_2.GROUP_FileListToManifest2.GROUP_Transfer_2_nosubfolder.Transfer_2_nosubfolder]:
    FollowSymbolicLinks: [yes]
08:46:24.471 (7) Message from lmmrly2803.fabric.bbc.co.uk - Source initialization command [MediaDropBox.GROUP_FileList.Group.Transfer_2.GROUP_FileListToManifest2.GROUP_Transfer_2_nosubfolder.Transfer_2_nosubfolder]:
    FileReadinessCheckType: [None]
08:46:24.471 (7) Message from lmmrly2803.fabric.bbc.co.uk - Source initialization command [MediaDropBox.GROUP_FileList.Group.Transfer_2.GROUP_FileListToManifest2.GROUP_Transfer_2_nosubfolder.Transfer_2_nosubfolder]:
    FileReadinessCheckDelay: [0]
08:46:24.471 (7) Message from lmmrly2803.fabric.bbc.co.uk - Source initialization command [MediaDropBox.GROUP_FileList.Group.Transfer_2.GROUP_FileListToManifest2.GROUP_Transfer_2_nosubfolder.Transfer_2_nosubfolder]:
    DeliveryMode: [Log File Name]
08:46:24.476 (4) Finished job component: MediaDropBox.GROUP_FileList.Group.Transfer_1.GROUP_FileListToManifest1.FileListToManifest1
08:46:24.511 (7) Message from lmmrly2803.fabric.bbc.co.uk - Source agent setup command (ukwpfdsl01.ebms.tv ukwpfdsl02.ebms.tv) [MediaDropBox.GROUP_FileList.Group.Transfer_2.GROUP_FileListToManifest2.GROUP_Transfer_2_nosubfolder.Transfer_2_nosubfolder]:
    Establishing communication between lmmrly2803.fabric.bbc.co.uk and ukwpfdsl01.ebms.tv ukwpfdsl02.ebms.tv
08:46:24.529 (7) Message from lmmrly2803.fabric.bbc.co.uk - Source file agent [MediaDropBox.GROUP_FileList.Group.Transfer_2.GROUP_FileListToManifest2.GROUP_Transfer_2_nosubfolder.Transfer_2_nosubfolder]:
    The channel to ukwpfdsl02.ebms.tv is mutually authenticated (Cipher=AES256-SHA, Keysize=256/256).
08:46:24.557 (7) Message from lmmrly2803.fabric.bbc.co.uk - Source file agent [MediaDropBox.GROUP_FileList.Group.Transfer_2.GROUP_FileListToManifest2.GROUP_Transfer_2_nosubfolder.Transfer_2_nosubfolder]:
    The channel to ukwpfdsl02.ebms.tv is mutually authenticated (Cipher=AES256-SHA, Keysize=256/256).
08:46:24.559 (7) Message from ukwpfdsl02.ebms.tv - File agent [MediaDropBox.GROUP_FileList.Group.Transfer_2.GROUP_FileListToManifest2.GROUP_Transfer_2_nosubfolder.Transfer_2_nosubfolder]:
    The channel from lmmrly2803.fabric.bbc.co.uk is mutually authenticated (Cipher=AES256-SHA, Keysize=256/256).
08:46:24.635 (4) Starting group: MediaDropBox.GROUP_FileList.Group.Transfer_1.GROUP_FileListToManifest1.GROUP_Transfer_1_nosubfolder (decision)
08:46:24.637 (4) Executing component instance 'MediaDropBox.GROUP_FileList.Group.Transfer_1.GROUP_FileListToManifest1.GROUP_Transfer_1_nosubfolder.Transfer_1_nosubfolder' property mapping command
08:46:24.686 (7) Adding package variable: Inputs.Source=\'\'
08:46:24.686 (7) Adding package variable: Inputs.Source.src_node_list='WeatherAgents!9\'
08:46:24.686 (7) Adding package variable: Inputs.Source.SourceData='<SIGLIST TYPE='PATHLIST' XATTRS='/mnt/staging2/clip.dir/Transfers/TransferSigniantEricssonWorld' ><EL S='3252964112' T='F' MT='2017-07-05T08:33:27Z' V='/mnt/staging2/clip.dir/Transfers/TransferSigniantEricssonWorld/WEBF2717_VA22_GEN_2017_07_05_09-29-16/WEBF2717_VA22_GEN.mxf' /><EL S='1621' T='F' MT='2017-07-05T08:33:42Z' V='/mnt/staging2/clip.dir/Transfers/TransferSigniantEricssonWorld/WEBF2717_VA22_GEN_2017_07_05_09-29-16/WEBF2717_VA22_GEN.xml' /> </SIGLIST>\'
08:46:24.686 (7) Adding package variable: Inputs.Source.IncludeFiles='*.mxf,*.xml,*.m2v,*.wav,*.aiff,*.mov\'
08:46:24.686 (7) Adding package variable: Inputs.Source.ExcludeFiles=\'\'
08:46:24.686 (7) Adding package variable: Inputs.Source.ExcludeSubdirectories='None\'
08:46:24.686 (7) Adding package variable: Inputs.Source.ExcludeSubDirList=\'\'
08:46:24.686 (7) Adding package variable: Inputs.Source.FileReadinessCheckType='None\'
08:46:24.686 (7) Adding package variable: Inputs.Source.FileReadinessCheckDelay='10\'
08:46:24.686 (7) Adding package variable: Inputs.Source.SourceDeletionsPostTransfer='none\'
08:46:24.686 (7) Adding package variable: Inputs.Source.SourceDeletionExcludeDirectories=\'\'
08:46:24.686 (7) Adding package variable: Inputs.Source.src_user='%dds_default_user%\'
08:46:24.686 (7) Adding package variable: Inputs.Target=\'\'
08:46:24.686 (7) Adding package variable: Inputs.Target.tgt_node_list='Ericsson_North!9\'
08:46:24.686 (7) Adding package variable: Inputs.Target.TargetDirectory='/stornext/MC_MG_INCOMING/BBC/BBC_WORLD_NEWS/PROGRAMMES/SIDECAR/NORMAL/\'
08:46:24.686 (7) Adding package variable: Inputs.Target.PathMappingOptions=\'\'
08:46:24.686 (7) Adding package variable: Inputs.Target.maximumJobDateTimeDirectories='10\'
08:46:24.686 (7) Adding package variable: Inputs.Target.RemoveTargetFiles='no\'
08:46:24.686 (7) Adding package variable: Inputs.Target.removeExpiredDirsonTarget='no\'
08:46:24.686 (7) Adding package variable: Inputs.Target.RemoveOlderThan='30\'
08:46:24.686 (7) Adding package variable: Inputs.Target.tgt_user='%dds_default_user%\'
08:46:24.686 (7) Adding package variable: Inputs.Target.discardSubFolders='yes\'
08:46:24.686 (7) Adding package variable: Inputs.Transport=\'\'
08:46:24.686 (7) Adding package variable: Inputs.Transport.udp_transfer='yes\'
08:46:24.686 (7) Adding package variable: Inputs.Transport.udp_aggressiveness='medium\'
08:46:24.686 (7) Adding package variable: Inputs.Transport.throughput_tgt='0\'
08:46:24.686 (7) Adding package variable: Inputs.Transport.bw_floor='0\'
08:46:24.686 (7) Adding package variable: Inputs.Transport.bw_throttle='0\'
08:46:24.686 (7) Adding package variable: Inputs.Transport.bw_throttle_tod='00:00;00:00;YYYYYYY;0;\'
08:46:24.686 (7) Adding package variable: Inputs.Options=\'\'
08:46:24.686 (7) Adding package variable: Inputs.Options.certified_delivery='unsigned\'
08:46:24.686 (7) Adding package variable: Inputs.Options.check_type='timesize\'
08:46:24.686 (7) Adding package variable: Inputs.Options.compression='no\'
08:46:24.686 (7) Adding package variable: Inputs.Options.follow_symlinks='yes\'
08:46:24.686 (7) Adding package variable: Inputs.Options.transferFilesInSortedOrder='yes\'
08:46:24.686 (7) Adding package variable: Inputs.Options.rsync='no\'
08:46:24.686 (7) Adding package variable: Inputs.Options.src_file_inuse_action='error\'
08:46:24.686 (7) Adding package variable: Inputs.Options.synchronize='no\'
08:46:24.686 (7) Adding package variable: Inputs.Options.tgt_file_inuse_action='error\'
08:46:24.686 (7) Adding package variable: Inputs.Options.RemoveParentFolder='yes\'
08:46:24.686 (7) Adding package variable: Inputs.Options.verifyforsufficientdiskspacebeforeJobtransfersstart='no\'
08:46:24.686 (7) Adding package variable: Inputs.Options.verifytargetdirectoryexists='no\'
08:46:24.884 (4) Starting job component: MediaDropBox.GROUP_FileList.Group.Transfer_1.GROUP_FileListToManifest1.GROUP_Transfer_1_nosubfolder.Transfer_1_nosubfolder [(lmmrly2803.fabric.bbc.co.uk lmmrly2804.fabric.bbc.co.uk)]
08:46:25.222 (7) Message from lmmrly2804.fabric.bbc.co.uk - File agent [MediaDropBox.GROUP_FileList.Group.Transfer_1.GROUP_FileListToManifest1.GROUP_Transfer_1_nosubfolder.Transfer_1_nosubfolder]:
    The channel from sig01vip.national.core.bbc.co.uk is mutually authenticated (Cipher=AES256-SHA, Keysize=256/256).
08:46:25.274 (7) Message from lmmrly2804.fabric.bbc.co.uk - Source file agent [MediaDropBox.GROUP_FileList.Group.Transfer_1.GROUP_FileListToManifest1.GROUP_Transfer_1_nosubfolder.Transfer_1_nosubfolder]:
    The maximum concurrent agent count has been reduced from 8 to 5 because lmmrly2804 only supports 64 threads per process.
08:46:25.370 (7) Message from lmmrly2804.fabric.bbc.co.uk - Source initialization command [MediaDropBox.GROUP_FileList.Group.Transfer_1.GROUP_FileListToManifest1.GROUP_Transfer_1_nosubfolder.Transfer_1_nosubfolder]:
    Executing SigniantDistribute component: Transfer_1_nosubfolder
08:46:25.391 (7) Message from lmmrly2804.fabric.bbc.co.uk - Source initialization command [MediaDropBox.GROUP_FileList.Group.Transfer_1.GROUP_FileListToManifest1.GROUP_Transfer_1_nosubfolder.Transfer_1_nosubfolder]:
    JobDateTimeStamp: [17-07-05_08-43-00.24376]
08:46:25.391 (7) Message from lmmrly2804.fabric.bbc.co.uk - Source initialization command [MediaDropBox.GROUP_FileList.Group.Transfer_1.GROUP_FileListToManifest1.GROUP_Transfer_1_nosubfolder.Transfer_1_nosubfolder]:
    SourceAgent: [lmmrly2804.fabric.bbc.co.uk]
08:46:25.391 (7) Message from lmmrly2804.fabric.bbc.co.uk - Source initialization command [MediaDropBox.GROUP_FileList.Group.Transfer_1.GROUP_FileListToManifest1.GROUP_Transfer_1_nosubfolder.Transfer_1_nosubfolder]:
    SourceAgentPlatform: [x86_64-Linux-RH5]
08:46:25.392 (7) Message from lmmrly2804.fabric.bbc.co.uk - Source initialization command [MediaDropBox.GROUP_FileList.Group.Transfer_1.GROUP_FileListToManifest1.GROUP_Transfer_1_nosubfolder.Transfer_1_nosubfolder]:
    SourceAgentUserid: [root]
08:46:25.392 (7) Message from lmmrly2804.fabric.bbc.co.uk - Source initialization command [MediaDropBox.GROUP_FileList.Group.Transfer_1.GROUP_FileListToManifest1.GROUP_Transfer_1_nosubfolder.Transfer_1_nosubfolder]:
    SourceHost: [WeatherAgents!9]
08:46:25.392 (7) Message from lmmrly2804.fabric.bbc.co.uk - Source initialization command [MediaDropBox.GROUP_FileList.Group.Transfer_1.GROUP_FileListToManifest1.GROUP_Transfer_1_nosubfolder.Transfer_1_nosubfolder]:
    SourceData: [/mnt/staging2/clip.dir/Transfers/TransferSigniantEricssonWorld/WEBF2717_VA22_GEN_2017_07_05_09-29-16/WEBF2717_VA22_GEN.mxf,/mnt/staging2/clip.dir/Transfers/TransferSigniantEricssonWorld/WEBF2717_VA22_GEN_2017_07_05_09-29-16/WEBF2717_VA22_GEN.xml]
08:46:25.392 (7) Message from lmmrly2804.fabric.bbc.co.uk - Source initialization command [MediaDropBox.GROUP_FileList.Group.Transfer_1.GROUP_FileListToManifest1.GROUP_Transfer_1_nosubfolder.Transfer_1_nosubfolder]:
    IncludeFiles: [*.mxf,*.xml,*.m2v,*.wav,*.aiff,*.mov]
08:46:25.392 (7) Message from lmmrly2804.fabric.bbc.co.uk - Source initialization command [MediaDropBox.GROUP_FileList.Group.Transfer_1.GROUP_FileListToManifest1.GROUP_Transfer_1_nosubfolder.Transfer_1_nosubfolder]:
    ExcludeFiles: []
08:46:25.392 (7) Message from lmmrly2804.fabric.bbc.co.uk - Source initialization command [MediaDropBox.GROUP_FileList.Group.Transfer_1.GROUP_FileListToManifest1.GROUP_Transfer_1_nosubfolder.Transfer_1_nosubfolder]:
    ExcludeSubdirectories: [None]
08:46:25.392 (7) Message from lmmrly2804.fabric.bbc.co.uk - Source initialization command [MediaDropBox.GROUP_FileList.Group.Transfer_1.GROUP_FileListToManifest1.GROUP_Transfer_1_nosubfolder.Transfer_1_nosubfolder]:
    ExcludeSubDirList: []
08:46:25.392 (7) Message from lmmrly2804.fabric.bbc.co.uk - Source initialization command [MediaDropBox.GROUP_FileList.Group.Transfer_1.GROUP_FileListToManifest1.GROUP_Transfer_1_nosubfolder.Transfer_1_nosubfolder]:
    TargetHosts: [Ericsson_North!9]
08:46:25.392 (7) Message from lmmrly2804.fabric.bbc.co.uk - Source initialization command [MediaDropBox.GROUP_FileList.Group.Transfer_1.GROUP_FileListToManifest1.GROUP_Transfer_1_nosubfolder.Transfer_1_nosubfolder]:
    TargetDirectory: [/stornext/MC_MG_INCOMING/BBC/BBC_WORLD_NEWS/PROGRAMMES/SIDECAR/NORMAL]
08:46:25.392 (7) Message from lmmrly2804.fabric.bbc.co.uk - Source initialization command [MediaDropBox.GROUP_FileList.Group.Transfer_1.GROUP_FileListToManifest1.GROUP_Transfer_1_nosubfolder.Transfer_1_nosubfolder]:
    PathMappingOptions: []
08:46:25.392 (7) Message from lmmrly2804.fabric.bbc.co.uk - Source initialization command [MediaDropBox.GROUP_FileList.Group.Transfer_1.GROUP_FileListToManifest1.GROUP_Transfer_1_nosubfolder.Transfer_1_nosubfolder]:
    SkipParentFolder: [yes]
08:46:25.392 (7) Message from lmmrly2804.fabric.bbc.co.uk - Source initialization command [MediaDropBox.GROUP_FileList.Group.Transfer_1.GROUP_FileListToManifest1.GROUP_Transfer_1_nosubfolder.Transfer_1_nosubfolder]:
    SourceDeletionsPostTransfer: [none]
08:46:25.392 (7) Message from lmmrly2804.fabric.bbc.co.uk - Source initialization command [MediaDropBox.GROUP_FileList.Group.Transfer_1.GROUP_FileListToManifest1.GROUP_Transfer_1_nosubfolder.Transfer_1_nosubfolder]:
    SourceDeletionExcludeDirectories: []
08:46:25.392 (7) Message from lmmrly2804.fabric.bbc.co.uk - Source initialization command [MediaDropBox.GROUP_FileList.Group.Transfer_1.GROUP_FileListToManifest1.GROUP_Transfer_1_nosubfolder.Transfer_1_nosubfolder]:
    RemoveTargetFiles: [no]
08:46:25.392 (7) Message from lmmrly2804.fabric.bbc.co.uk - Source initialization command [MediaDropBox.GROUP_FileList.Group.Transfer_1.GROUP_FileListToManifest1.GROUP_Transfer_1_nosubfolder.Transfer_1_nosubfolder]:
    RemoveTargetDirs: [no]
08:46:25.393 (7) Message from lmmrly2804.fabric.bbc.co.uk - Source initialization command [MediaDropBox.GROUP_FileList.Group.Transfer_1.GROUP_FileListToManifest1.GROUP_Transfer_1_nosubfolder.Transfer_1_nosubfolder]:
    RemoveOlderThan: [30]
08:46:25.393 (7) Message from lmmrly2804.fabric.bbc.co.uk - Source initialization command [MediaDropBox.GROUP_FileList.Group.Transfer_1.GROUP_FileListToManifest1.GROUP_Transfer_1_nosubfolder.Transfer_1_nosubfolder]:
    JobLogDetail: [INFO]
08:46:25.393 (7) Message from lmmrly2804.fabric.bbc.co.uk - Source initialization command [MediaDropBox.GROUP_FileList.Group.Transfer_1.GROUP_FileListToManifest1.GROUP_Transfer_1_nosubfolder.Transfer_1_nosubfolder]:
    MaximumBandwidthLimit: [00:00;00:00;YYYYYYY;0;]
08:46:25.393 (7) Message from lmmrly2804.fabric.bbc.co.uk - Source initialization command [MediaDropBox.GROUP_FileList.Group.Transfer_1.GROUP_FileListToManifest1.GROUP_Transfer_1_nosubfolder.Transfer_1_nosubfolder]:
    WANAcceleratorOn: [yes]
08:46:25.393 (7) Message from lmmrly2804.fabric.bbc.co.uk - Source initialization command [MediaDropBox.GROUP_FileList.Group.Transfer_1.GROUP_FileListToManifest1.GROUP_Transfer_1_nosubfolder.Transfer_1_nosubfolder]:
    WANAcceleratorAggressiveness: [medium]
08:46:25.393 (7) Message from lmmrly2804.fabric.bbc.co.uk - Source initialization command [MediaDropBox.GROUP_FileList.Group.Transfer_1.GROUP_FileListToManifest1.GROUP_Transfer_1_nosubfolder.Transfer_1_nosubfolder]:
    BandwidthCeiling: [0]
08:46:25.393 (7) Message from lmmrly2804.fabric.bbc.co.uk - Source initialization command [MediaDropBox.GROUP_FileList.Group.Transfer_1.GROUP_FileListToManifest1.GROUP_Transfer_1_nosubfolder.Transfer_1_nosubfolder]:
    BandwidthFloor: [0]
08:46:25.393 (7) Message from lmmrly2804.fabric.bbc.co.uk - Source initialization command [MediaDropBox.GROUP_FileList.Group.Transfer_1.GROUP_FileListToManifest1.GROUP_Transfer_1_nosubfolder.Transfer_1_nosubfolder]:
    CompressFiles: [no]
08:46:25.393 (7) Message from lmmrly2804.fabric.bbc.co.uk - Source initialization command [MediaDropBox.GROUP_FileList.Group.Transfer_1.GROUP_FileListToManifest1.GROUP_Transfer_1_nosubfolder.Transfer_1_nosubfolder]:
    FollowSymbolicLinks: [yes]
08:46:25.394 (7) Message from lmmrly2804.fabric.bbc.co.uk - Source initialization command [MediaDropBox.GROUP_FileList.Group.Transfer_1.GROUP_FileListToManifest1.GROUP_Transfer_1_nosubfolder.Transfer_1_nosubfolder]:
    FileReadinessCheckType: [None]
08:46:25.394 (7) Message from lmmrly2804.fabric.bbc.co.uk - Source initialization command [MediaDropBox.GROUP_FileList.Group.Transfer_1.GROUP_FileListToManifest1.GROUP_Transfer_1_nosubfolder.Transfer_1_nosubfolder]:
    FileReadinessCheckDelay: [10]
08:46:25.394 (7) Message from lmmrly2804.fabric.bbc.co.uk - Source initialization command [MediaDropBox.GROUP_FileList.Group.Transfer_1.GROUP_FileListToManifest1.GROUP_Transfer_1_nosubfolder.Transfer_1_nosubfolder]:
    DeliveryMode: [Log File Name]
08:46:25.435 (7) Message from lmmrly2804.fabric.bbc.co.uk - Source agent setup command (ukmcfdsl02.ebms.tv ukmcfdsl01.ebms.tv) [MediaDropBox.GROUP_FileList.Group.Transfer_1.GROUP_FileListToManifest1.GROUP_Transfer_1_nosubfolder.Transfer_1_nosubfolder]:
    Establishing communication between lmmrly2804.fabric.bbc.co.uk and ukmcfdsl02.ebms.tv ukmcfdsl01.ebms.tv
08:46:25.472 (7) Message from lmmrly2804.fabric.bbc.co.uk - Source file agent [MediaDropBox.GROUP_FileList.Group.Transfer_1.GROUP_FileListToManifest1.GROUP_Transfer_1_nosubfolder.Transfer_1_nosubfolder]:
    The channel to ukmcfdsl01.ebms.tv is mutually authenticated (Cipher=AES256-SHA, Keysize=256/256).
08:46:25.516 (7) Message from lmmrly2804.fabric.bbc.co.uk - Source file agent [MediaDropBox.GROUP_FileList.Group.Transfer_1.GROUP_FileListToManifest1.GROUP_Transfer_1_nosubfolder.Transfer_1_nosubfolder]:
    The channel to ukmcfdsl01.ebms.tv is mutually authenticated (Cipher=AES256-SHA, Keysize=256/256).
08:46:25.522 (7) Message from ukmcfdsl01.ebms.tv - File agent [MediaDropBox.GROUP_FileList.Group.Transfer_1.GROUP_FileListToManifest1.GROUP_Transfer_1_nosubfolder.Transfer_1_nosubfolder]:
    The channel from lmmrly2804.fabric.bbc.co.uk is mutually authenticated (Cipher=AES256-SHA, Keysize=256/256).
08:46:30.298 (7) Message from ukmcfdsl01.ebms.tv - Target initialization command [MediaDropBox.GROUP_FileList.Group.Transfer_1.GROUP_FileListToManifest1.GROUP_Transfer_1_nosubfolder.Transfer_1_nosubfolder]:
    TargetAgent: [ukmcfdsl01.ebms.tv]
08:46:30.298 (7) Message from ukmcfdsl01.ebms.tv - Target initialization command [MediaDropBox.GROUP_FileList.Group.Transfer_1.GROUP_FileListToManifest1.GROUP_Transfer_1_nosubfolder.Transfer_1_nosubfolder]:
    TargetAgentPlatform: [x86_64-Linux-RH6]
08:46:30.298 (7) Message from ukmcfdsl01.ebms.tv - Target initialization command [MediaDropBox.GROUP_FileList.Group.Transfer_1.GROUP_FileListToManifest1.GROUP_Transfer_1_nosubfolder.Transfer_1_nosubfolder]:
    TargetAgentUserid: [root]
08:46:30.298 (7) Message from ukmcfdsl01.ebms.tv - Target initialization command [MediaDropBox.GROUP_FileList.Group.Transfer_1.GROUP_FileListToManifest1.GROUP_Transfer_1_nosubfolder.Transfer_1_nosubfolder]:
    TargetDirectory: [/stornext/MC_MG_INCOMING/BBC/BBC_WORLD_NEWS/PROGRAMMES/SIDECAR/NORMAL]
08:46:30.298 (7) Message from ukmcfdsl01.ebms.tv - Target initialization command [MediaDropBox.GROUP_FileList.Group.Transfer_1.GROUP_FileListToManifest1.GROUP_Transfer_1_nosubfolder.Transfer_1_nosubfolder]:
    VerifyTargetDirectoryExists: [no]
08:46:30.301 (7) Message from ukmcfdsl01.ebms.tv - Target initialization command [MediaDropBox.GROUP_FileList.Group.Transfer_1.GROUP_FileListToManifest1.GROUP_Transfer_1_nosubfolder.Transfer_1_nosubfolder]:
    VerifyForSufficientDiskSpace: [no]
08:46:30.301 (7) Message from ukmcfdsl01.ebms.tv - Target initialization command [MediaDropBox.GROUP_FileList.Group.Transfer_1.GROUP_FileListToManifest1.GROUP_Transfer_1_nosubfolder.Transfer_1_nosubfolder]:
    Transferring files...
08:46:30.323 (7) Message from lmmrly2804.fabric.bbc.co.uk - Source file agent [MediaDropBox.GROUP_FileList.Group.Transfer_1.GROUP_FileListToManifest1.GROUP_Transfer_1_nosubfolder.Transfer_1_nosubfolder]:
    The negotiated UDP message size for the connection to ukmcfdsl01.ebms.tv is 1472 bytes.
08:46:31.167 (7) Message from ukwpfdsl02.ebms.tv - Target initialization command [MediaDropBox.GROUP_FileList.Group.Transfer_2.GROUP_FileListToManifest2.GROUP_Transfer_2_nosubfolder.Transfer_2_nosubfolder]:
    TargetAgent: [ukwpfdsl02.ebms.tv]
08:46:31.167 (7) Message from ukwpfdsl02.ebms.tv - Target initialization command [MediaDropBox.GROUP_FileList.Group.Transfer_2.GROUP_FileListToManifest2.GROUP_Transfer_2_nosubfolder.Transfer_2_nosubfolder]:
    TargetAgentPlatform: [x86_64-Linux-RH6]
08:46:31.167 (7) Message from ukwpfdsl02.ebms.tv - Target initialization command [MediaDropBox.GROUP_FileList.Group.Transfer_2.GROUP_FileListToManifest2.GROUP_Transfer_2_nosubfolder.Transfer_2_nosubfolder]:
    TargetAgentUserid: [root]
08:46:31.167 (7) Message from ukwpfdsl02.ebms.tv - Target initialization command [MediaDropBox.GROUP_FileList.Group.Transfer_2.GROUP_FileListToManifest2.GROUP_Transfer_2_nosubfolder.Transfer_2_nosubfolder]:
    TargetDirectory: [/stornext/WP_MG_INCOMING/BBC/BBC_WORLD_NEWS/PROGRAMMES/SIDECAR/NORMAL]
08:46:31.167 (7) Message from ukwpfdsl02.ebms.tv - Target initialization command [MediaDropBox.GROUP_FileList.Group.Transfer_2.GROUP_FileListToManifest2.GROUP_Transfer_2_nosubfolder.Transfer_2_nosubfolder]:
    VerifyTargetDirectoryExists: [no]
08:46:31.170 (7) Message from ukwpfdsl02.ebms.tv - Target initialization command [MediaDropBox.GROUP_FileList.Group.Transfer_2.GROUP_FileListToManifest2.GROUP_Transfer_2_nosubfolder.Transfer_2_nosubfolder]:
    VerifyForSufficientDiskSpace: [no]
08:46:31.171 (7) Message from ukwpfdsl02.ebms.tv - Target initialization command [MediaDropBox.GROUP_FileList.Group.Transfer_2.GROUP_FileListToManifest2.GROUP_Transfer_2_nosubfolder.Transfer_2_nosubfolder]:
    Transferring files...
08:46:31.173 (7) Message from lmmrly2803.fabric.bbc.co.uk - Source file agent [MediaDropBox.GROUP_FileList.Group.Transfer_2.GROUP_FileListToManifest2.GROUP_Transfer_2_nosubfolder.Transfer_2_nosubfolder]:
    The negotiated UDP message size for the connection to ukwpfdsl02.ebms.tv is 1472 bytes.
08:46:34.413 (7) Message from ukmcfdsl01.ebms.tv - Target agent setup command (lmmrly2804.fabric.bbc.co.uk) [MediaDropBox.GROUP_FileList.Group.Transfer_1.GROUP_FileListToManifest1.GROUP_Transfer_1_nosubfolder.Transfer_1_nosubfolder]:
    PathMappingOptions:
08:46:34.415 (7) Message from ukwpfdsl02.ebms.tv - Target agent setup command (lmmrly2803.fabric.bbc.co.uk) [MediaDropBox.GROUP_FileList.Group.Transfer_2.GROUP_FileListToManifest2.GROUP_Transfer_2_nosubfolder.Transfer_2_nosubfolder]:
    PathMappingOptions:
08:48:05.499 (7) Message from lmmrly2804.fabric.bbc.co.uk - Source finalize command [MediaDropBox.GROUP_FileList.Group.Transfer_1.GROUP_FileListToManifest1.GROUP_Transfer_1_nosubfolder.Transfer_1_nosubfolder]:

08:48:05.616 (4) Finished job component: MediaDropBox.GROUP_FileList.Group.Transfer_1.GROUP_FileListToManifest1.GROUP_Transfer_1_nosubfolder.Transfer_1_nosubfolder
08:48:05.617 (4) Starting group: MediaDropBox.GROUP_FileList.Group.Transfer_1.AFTER_GROUP_Group3 (decision)
08:48:12.210 (7) Message from lmmrly2803.fabric.bbc.co.uk - Source finalize command [MediaDropBox.GROUP_FileList.Group.Transfer_2.GROUP_FileListToManifest2.GROUP_Transfer_2_nosubfolder.Transfer_2_nosubfolder]:

08:48:12.324 (4) Finished job component: MediaDropBox.GROUP_FileList.Group.Transfer_2.GROUP_FileListToManifest2.GROUP_Transfer_2_nosubfolder.Transfer_2_nosubfolder
08:48:12.324 (4) Starting group: MediaDropBox.GROUP_FileList.Group.Transfer_2.AFTER_GROUP_Group2 (decision)
08:48:12.325 (4) Starting group: MediaDropBox.GROUP_FileList.Group.AFTER_GROUP_Group (decision)
08:48:12.485 (4) Starting group: MediaDropBox.GROUP_FileList.Group.AFTER_GROUP_Group.GROUP_DeleteFiles (decision)
08:48:12.486 (4) Executing component instance 'MediaDropBox.GROUP_FileList.Group.AFTER_GROUP_Group.GROUP_DeleteFiles.DeleteFiles' property mapping command
08:48:12.561 (7) Adding package variable: Inputs.Target=\'\'
08:48:12.561 (7) Adding package variable: Inputs.Target.tgt_node_list='WeatherAgents!9\'
08:48:12.561 (7) Adding package variable: Inputs.Target.fileList='<SIGLIST TYPE='PATHLIST' XATTRS='/mnt/staging2/clip.dir/Transfers/TransferSigniantEricssonWorld' ><EL S='4096' T='D' MT='2017-07-05T08:33:43Z' V='/mnt/staging2/clip.dir/Transfers/TransferSigniantEricssonWorld' /><EL S='0' T='D' MT='2017-07-05T08:33:42Z' V='/mnt/staging2/clip.dir/Transfers/TransferSigniantEricssonWorld/WEBF2717_VA22_GEN_2017_07_05_09-29-16' /><EL S='3252964112' T='F' MT='2017-07-05T08:33:27Z' V='/mnt/staging2/clip.dir/Transfers/TransferSigniantEricssonWorld/WEBF2717_VA22_GEN_2017_07_05_09-29-16/WEBF2717_VA22_GEN.mxf' /><EL S='1621' T='F' MT='2017-07-05T08:33:42Z' V='/mnt/staging2/clip.dir/Transfers/TransferSigniantEricssonWorld/WEBF2717_VA22_GEN_2017_07_05_09-29-16/WEBF2717_VA22_GEN.xml' /> </SIGLIST>\'
08:48:12.561 (7) Adding package variable: Inputs.Target.baseDirectory='/mnt/staging2/clip.dir/Transfers/TransferSigniantEricssonWorld\'
08:48:12.561 (7) Adding package variable: Inputs.Target.deleteDirectories='yes\'
08:48:12.561 (7) Adding package variable: Inputs.Target.deleteBaseDirectory='no\'
08:48:12.561 (7) Adding package variable: Inputs.Transport=\'\'
08:48:12.561 (7) Adding package variable: Inputs.Options=\'\'
08:48:12.561 (7) Adding package variable: Inputs.Options.failComponentonFileErrors='no\'
08:48:12.685 (4) Starting job component: MediaDropBox.GROUP_FileList.Group.AFTER_GROUP_Group.GROUP_DeleteFiles.DeleteFiles
08:48:13.041 (7) Message from sig01vip.national.core.bbc.co.uk - Command control agent [MediaDropBox.GROUP_FileList.Group.AFTER_GROUP_Group.GROUP_DeleteFiles.DeleteFiles]:
    The channel to lmmrly2803.fabric.bbc.co.uk is mutually authenticated (Cipher=AES256-SHA, Keysize=256/256).
08:48:13.186 (7) Message from sig01vip.national.core.bbc.co.uk - Command control agent [MediaDropBox.GROUP_FileList.Group.AFTER_GROUP_Group.GROUP_DeleteFiles.DeleteFiles]:
    The channel to lmmrly2803.fabric.bbc.co.uk is mutually authenticated (Cipher=AES256-SHA, Keysize=256/256).
08:48:13.188 (7) Message from lmmrly2803.fabric.bbc.co.uk - Command agent [MediaDropBox.GROUP_FileList.Group.AFTER_GROUP_Group.GROUP_DeleteFiles.DeleteFiles]:
    The channel from sig01vip.national.core.bbc.co.uk is mutually authenticated (Cipher=AES256-SHA, Keysize=256/256).
08:48:24.268 (4) Finished job component: MediaDropBox.GROUP_FileList.Group.AFTER_GROUP_Group.GROUP_DeleteFiles.DeleteFiles
08:48:24.474 (4) Starting group: MediaDropBox.GROUP_FileList.Group.AFTER_GROUP_Group.GROUP_DeleteFiles.GROUP_JobReport1 (decision)
08:48:24.475 (4) Executing component instance 'MediaDropBox.GROUP_FileList.Group.AFTER_GROUP_Group.GROUP_DeleteFiles.GROUP_JobReport1.JobReport1' property mapping command
08:48:24.532 (7) Adding package variable: Inputs.ReportOptions=\'\'
08:48:24.532 (7) Adding package variable: Inputs.ReportOptions.EmailTo='weather.transfer@bbc.co.uk;WNE_MediaTransfer_Weather@bbc.com\'
08:48:24.532 (7) Adding package variable: Inputs.ReportOptions.EmailCc='signiantnotifications@bbc.co.uk\'
08:48:24.532 (7) Adding package variable: Inputs.ReportOptions.EmailBcc=\'\'
08:48:24.532 (7) Adding package variable: Inputs.ReportOptions.EmailSubject=\'\'
08:48:24.532 (7) Adding package variable: Inputs.ReportOptions.EmailCondition='On Transfer\'
08:48:24.532 (7) Adding package variable: Inputs.ReportOptions.ReportVersionsToMaintain='0\'
08:48:24.532 (7) Adding package variable: Inputs.ReportOptions.reportingTimezone='GB-Eire\'
08:48:24.532 (7) Adding package variable: Inputs.ReportOptions.considerDeletions='yes\'
08:48:24.532 (7) Adding package variable: Inputs.ReportOptions.emailJobFailureReportTo='Mediacentralni@bbc.co.uk;WNE_MediaTransfer_Weather@bbc.com\'
08:48:24.532 (7) Adding package variable: Inputs.sNMPTrapOptions.sNMPTrapReceivers=\'\'
08:48:24.532 (7) Adding package variable: Inputs.sNMPTrapOptions.sNMPTrapCommunityString=\'\'
08:48:24.532 (7) Adding package variable: Inputs.sNMPTrapOptions.sNMPTrapTypes=\'\'
08:48:24.647 (4) Executing component instance 'MediaDropBox.GROUP_FileList.Group.AFTER_GROUP_Group.GROUP_DeleteFiles.GROUP_JobReport1.JobReport1' preparation command command
08:48:24.700 (7) Adding package variable: DdsTempDir='/tmp\'
08:48:24.815 (4) Starting job component: MediaDropBox.GROUP_FileList.Group.AFTER_GROUP_Group.GROUP_DeleteFiles.GROUP_JobReport1.JobReport1*
08:48:24.815 (4) Executing component instance 'MediaDropBox.GROUP_FileList.Group.AFTER_GROUP_Group.GROUP_DeleteFiles.GROUP_JobReport1.JobReport1' supervisor command command
08:48:24.946 (7) Executing JobReport component: JobReport1
08:48:24.955 (7) Email To: [weather.transfer@bbc.co.uk;WNE_MediaTransfer_Weather@bbc.com]
08:48:24.955 (7) Email Cc: [signiantnotifications@bbc.co.uk]
08:48:24.956 (7) Email Bcc: []
08:48:24.956 (7) Email Job Failure Report To: [Mediacentralni@bbc.co.uk;WNE_MediaTransfer_Weather@bbc.com]
08:48:24.956 (7) Email Subject: [Weather_World_from_H_to_EricssonPlayout]
08:48:24.956 (7) Email Condition: [On Transfer]
08:48:24.956 (7) Report Versions To Maintain: [0]
08:48:24.957 (7) Reporting Timezone: [GB-Eire]
08:48:24.957 (7) SNMP Trap Receivers: []
08:48:24.957 (7) SNMP Trap Types: []
08:48:26.975 (7) Generating job report...
08:48:27.384 (7) Job report generated successfully.
08:48:27.384 (7) Emailing job report...
08:48:33.464 (7) Job report emailed successfully.
08:48:33.465 (7) Job Report component completed successfully
08:48:33.583 (4) Finished job component: JobReport1
08:48:33.743 (4) Finished group: Group
08:48:33.743 (4) Workflow MediaDropBox has completed successfully.
08:48:33.743 (4) Group execution results:
    Total groups in context:         18
    Number executed:                  9
    Errors:                           0
08:48:33.743 (4) Job component execution results:
    Total components in context:     11
    Number executed:                  7
    Errors:                           0
  Executing at the 'manager_exit' point -- the exit code is 0

'''

    private MxfLogAnalyzerUnitSpecExamples() {
        throw new IllegalAccessException()
    }

}
