# Awesome Project Build with TypeORM

Steps to run this project:

1. Run `npm i` command
2. Setup database settings inside `ormconfig.json` file
3. Run `npm start` command

```
// Generate Migration
ts-node ./node_modules/typeorm/cli.js migration:generate -n MigrationFileName
// Execute Migrations
ts-node ./node_modules/typeorm/cli.js migration:run
// Revert Migrations
ts-node ./node_modules/typeorm/cli.js migration:revert
```