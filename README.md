# watch-and-tar

Watch a [MinION](https://nanoporetech.com/products/minion) reads directory and automatically create .tar.gz files.

During a MinION run, thousands of `.fast5` files are created. By default, they're stored in batches of 4000 in numbered sub-directories as follows:

```
reads
└── 20181113_1428_ecoli_rapidbc
    ├── 0
    │   ├── MinMaster_20181113_FAJ05792_MN24687_sequencing_run_ecoli_rapidbc_0_b6a82d43-2717-4009-b002-77b5c1fd1168.fast5
    │   ├── MinMaster_20181113_FAJ05792_MN24687_sequencing_run_ecoli_rapidbc_10_5162d5c6-c3c3-4221-a58a-71c2722c2566.fast5
    │   ├── MinMaster_20181113_FAJ05792_MN24687_sequencing_run_ecoli_rapidbc_11_8d2c7e06-1d1e-47cd-a4d4-b09890c66c39.fast5
    │   ├── MinMaster_20181113_FAJ05792_MN24687_sequencing_run_ecoli_rapidbc_12_8b56240d-05dc-42bf-bc1a-ea7ce9cc51a4.fast5
    │   ├── MinMaster_20181113_FAJ05792_MN24687_sequencing_run_ecoli_rapidbc_1_2e1f0016-3b0e-4ab6-bca8-202da96bd5c1.fast5
    │   ...
    ├── 1
    │   ├── MinMaster_20181113_FAJ05792_MN24687_sequencing_run_ecoli_rapidbc_0_1190dd15-b380-4e71-b4ab-bc47ae768246.fast5
    │   ├── MinMaster_20181113_FAJ05792_MN24687_sequencing_run_ecoli_rapidbc_10_1cf68c36-8bbb-4a7c-bc4a-2b0b49ddc3a5.fast5
    │   ├── MinMaster_20181113_FAJ05792_MN24687_sequencing_run_ecoli_rapidbc_11_b6bca880-c5b9-49f5-9b9a-c2d6e3a496f4.fast5
    │   ├── MinMaster_20181113_FAJ05792_MN24687_sequencing_run_ecoli_rapidbc_12_3f7c63e9-8ae1-4e01-b26b-3ea17b824f3f.fast5
    │   ...
    ├── 2
    │   ...
```

The purpose of this tool is to monitor the `reads` directory and automatically compress those numbered sub-directories into `.tar.gz` files that can be efficiently streamed to a server using [Syncthing](https://syncthing.net/).

```
reads
└── 20181113_1428_ecoli_rapidbc
    ├── 0.tar.gz
    ├── 1.tar.gz
    ├── 2.tar.gz
    │   ...
```

## Usage

```
    $ java -jar watch-and-tar-0.1.0-standalone.jar [args]
```

## License

Copyright © 2018 Dan Fornika

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
