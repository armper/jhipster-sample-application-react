import { IPost } from 'app/shared/model/post.model';
import { IUser } from 'app/shared/model/user.model';

export interface ITopic {
  id?: number;
  title?: string;
  posts?: IPost[];
  user?: IUser;
}

export const defaultValue: Readonly<ITopic> = {};
