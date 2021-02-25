import { Route } from '@vaadin/router';
import {find} from './generated/UserEndpoint';

export type ViewRoute = Route & { title?: string; children?: ViewRoute[] };

export const views: ViewRoute[] = [
  {
    path: '/',
    async action() {
      await find();
    }
  }
];
export const routes: ViewRoute[] = [...views];
