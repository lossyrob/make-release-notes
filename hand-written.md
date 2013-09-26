A new minor release of GeoTrellis, 0.8.2, is now available as a release candidate: 0.8.2-RC2.  Please let us know if you find any issues with the release candidate so we can address them before the release of 0.8.2.  

One major announcement is that GeoTrellis 0.8.2 will be the first release under Apache 2, as we are switching licenses from GPL to Apache 2.  (Do we say more?  "The decision to change licenses was motivated by feedback from potential users for whom the GPL was a roadblock. ")
 
There are some exciting new features in this release:

### Geotrellis Transit
We've included new functionality for creating shortest path trees and creating transitshed rasters using the new geotrellis.network package. Please see [transit.geotrellis.com](http://transit.geotrellis.com) for more info, including demos and an API listing.

### New Operations

We've continued to add new raster operations, including Inverse Distance Weighted interpolation; zonal operations such as Percentage, Classification, Mean, local operations such as Mean, Variety, Combination, Minority, Majority, as well as vector transformations such as ToVector (vectorization), and RegionGroup.

### Simplified Workflow with Tiled Rasters

We have unified the API for working with tiled and untiled rasters: most operations will now work transparently on tiled or untiled operations.

### Improved Catalog and Data Import

A major refactor to the catalog code means that all layer types are now listed in the catalog (tiled, ascii grid, geotiff, etc.) and an improved internal organization for future development.  There is a new script, gtloader, for importing and tiling raster data. 

### Remoting Improvements

Critical bug and performance improvements were made to GeoTrellis clustering and remoting capabilities.
